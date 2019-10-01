package ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	int num;
	boolean flag=false;
	
	public synchronized void put(int num) throws InterruptedException
	{
		while(flag)
		{
			wait();
		}
		System.out.println("Put is:"+num);
		this.num=num;
		flag=true;
		notify();
	}
	public synchronized void get() throws InterruptedException
	{
		while(!flag)
		{
			wait();
		}
		System.out.println("Value is:"+num);
		flag=false;
		notify();
	}
	
//	int size;
//	Queue1(int size)
//	{
//		this.size=size;
//	}
//	
//	public synchronized void enqueue(int number) throws InterruptedException
//	{
//		while(queue.size()>=size)
//		{
//				wait();
//		}
//		System.out.println("Added Item is :"+number);
//		queue.add(number);
//		size++;
//		notify();
//			
//		
//		
//			
//	}
//	public synchronized void dequeue() throws InterruptedException
//	{
//		while(queue.isEmpty())
//		{
//			wait();
//		}
//		System.out.println("Remoed item is:"+queue.remove());
//		size--;
//		notify();
//		
//	}

}
