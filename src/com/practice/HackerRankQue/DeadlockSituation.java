package com.practice.HackerRankQue;

class A1
{
	
	public synchronized void print(B1 b)
	{
		System.out.println("inside A1");
		
		b.last();
	}
	
	public synchronized void last()
	{
		System.out.println("A1");
	}
}
class B1
{
	public synchronized void print(A1 a)
	{
		System.out.println("inside B1");
	
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("B1");
	}
	
}
class MyThread extends Thread
{
	A1 a;
	B1 b;
	public MyThread(A1 a1, B1 b) {
		this.a=a1;
		this.b=b;
	}
	public void run()
	{
		System.out.println("thread1");
		a.print(b);
	}
}

class MyThread1 extends Thread
{
	B1 b;
	A1 a;
	public MyThread1(A1 a,B1 b1) {
		this.a=a;
		this.b=b1;
	}
	public void run()
	{
		System.out.println("thread2");
		b.print(a);
		
	}
	
}

public class DeadlockSituation {

	public static void main(String[] args) {
		A1 a=new A1();
		B1 b=new B1();
		MyThread t1=new MyThread(a,b);
		MyThread1 t2=new MyThread1(a,b);
		t1.start();
		t2.start();

	}

}
