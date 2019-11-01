package com.practice.multithreading;

class AThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
}

public class ThreadPr1 {
	public static void main(String[] args) throws InterruptedException{
		AThread t=new AThread();
		AThread t1=new AThread();
		t.start();
		t.join();
		t1.start();
		t1.join();
		System.out.println("main thread");
	}
}
