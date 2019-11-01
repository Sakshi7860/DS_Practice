package com.practice.multithreading;
class Print
{
	boolean flag=false;

	public synchronized void printOdd(int i) throws InterruptedException
	{
		if(flag)
		{
			this.wait();
		}
		System.out.println(i);
		flag=true;
		this.notify();
		
	}
	
	public synchronized void printEven(int i) throws InterruptedException
	{
		if(!flag)
		{
			this.wait();
		}
		System.out.println(i);
		flag=false;
		this.notify();
		
	}
}

class DemoThread1 extends Thread
{
	Print p;
	
	public DemoThread1(Print p) {
		this.p=p;
		
	}
	
	public void run()
	{
		//System.out.println("DemoThread1");
		int i=1;
		while(i<=10)
		{
			try {
				p.printOdd(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i=i+2;
		}
		
	}
}
class DemoThread2 extends Thread
{
	Print p;
	public DemoThread2(Print p) {
		this.p=p;
			
	}
	
	public void run()
	{
		//System.out.println("DemoThread2");
		int i=2;
		while(i<=10)
		{
			try {
				p.printEven(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i=i+2;
		}
		
	}
}
public class PrintEvenOdd {

	public static void main(String[] args) {
		Print p=new Print();
		DemoThread1 t1=new DemoThread1(p);
		DemoThread2 t2=new DemoThread2(p);
		//System.out.println("Main Thread");
		t1.start();
		//System.out.println("main");
		t2.start();
	}

}
