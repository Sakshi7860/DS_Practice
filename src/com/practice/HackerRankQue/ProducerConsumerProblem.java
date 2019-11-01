package com.practice.HackerRankQue;
import java.util.LinkedList;
class PC
{
	LinkedList<Integer> list = new LinkedList<>(); 
	boolean flag=true;
	int capacity=3;
	public synchronized void produce(int val)
	{
		
		while(!flag)
		{
			try {
				while(list.size()==capacity)
					wait();	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
		
		System.out.println("value added"+val);
		list.add(val);
		//System.out.println(list);
		flag=false;
		notifyAll();
		
	}
	public synchronized void consume()
	{
		while(flag)
		{
			try {
				while(list.size()==0)
						wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		int val=list.removeFirst();
		System.out.println("value consumed"+val);
		flag=true;
		notifyAll();
		
		
	}
}
class Producer extends Thread
{
	PC pc;
	int limit;
	public Producer(PC p,int max) {
		this.pc=p;
		this.limit=max;
	}
	int count=0;
	public void run() 
	{
		while(count< limit)
		{
		pc.produce(count++);
		}
		
		
	}
}

class Consumer extends Thread
{
	PC pc;
	int limit;
	public Consumer(PC p, int max) {
		this.pc=p;
		this.limit=max;
		
	}
	int count=0;
	public void run() 
	{
		while(count<limit)
		{
			pc.consume();
			count++;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		PC pc=new PC();
		int limit=6;
		Producer p=new Producer(pc,limit);
		Consumer c=new Consumer(pc,limit);
		p.start();
		c.start();

	}

}
