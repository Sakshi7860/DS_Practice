package com.practice.multithreading;

import java.util.Deque;
import java.util.Queue;

import DS.LinkedList;

class Sample
 {
	Queue<Integer> queue=new java.util.LinkedList<Integer>();
	 public synchronized void addItem(int item) throws InterruptedException
	 {
		
		if(!queue.isEmpty())
			wait();
		queue.add(item);
		System.out.println(Thread.currentThread().getName()+"added item: "+item);
		notify();
		 
	 }
	 public synchronized void removeItem() throws InterruptedException
	 {
		 if(queue.isEmpty())
			 wait();
		 int item=queue.remove();
		 System.out.println(Thread.currentThread().getName()+"Item Removed: "+item);
		 notify();
		 
	 }
 }
class SampleThread1 extends Thread
{
	Sample s;
	boolean flag;
	int val=1;
	public SampleThread1(Sample s, boolean bool) {
		this.s=s;
		this.flag=bool;
	}
	public void run()
	{
		int i=1;
		while(i<=10)
		{
			if(flag)
			{
				try {
					s.addItem(val);
					flag=false;
					val++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				try {
					s.removeItem();
					flag=true;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			i++;
			
		}
		
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		Sample s=new Sample();
		SampleThread1 producer=new SampleThread1(s,true);
		SampleThread1 consumer=new SampleThread1(s,false);
		producer.start();
		consumer.start();
		
		

	}

}
