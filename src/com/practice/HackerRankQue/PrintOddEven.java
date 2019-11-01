package com.practice.HackerRankQue;

class Print
{
	boolean flag=false;
	public synchronized void printOdd(int number) throws InterruptedException
	{
		if(flag)
		{
			wait();
		}
		System.out.println("odd number is :"+number);
		flag=true;
		notify();
		
	}
	
	public synchronized void printEven(int number) throws InterruptedException
	{
		if(!flag)
		{
			wait();
		}
		System.out.println("even number is:"+number);
		flag=false;
		notify();
	}
}

class oddThread extends Thread
{
	Print p;
	int num;
	public oddThread(Print pr, int number) {
		this.p=pr;
		 this.num=number;
		
	}
	int i=1;
	public void run()
	{
		System.out.println("print odd thread");
		while(i<num) {
			try {
				System.out.println("in while");
				p.printOdd(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		i=i+2;
	}
	}
}

class evenThread extends Thread
{
	Print p;
	int num;
	public evenThread(Print pr, int number) {
		this.p=pr;
		this.num=number;
	}
	int i=2;
	public void run()
	{
		System.out.println("print even thread");
		while(i<num)
		{
			try {
				System.out.println("in while even");
				p.printEven(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i=i+2;
		}
	}
}

public class PrintOddEven {

	public static void main(String[] args) {
		Print p=new Print();
		oddThread odd=new oddThread(p,10);
		evenThread even=new evenThread(p, 10);
		odd.start();
		even.start();
		
	}

}
