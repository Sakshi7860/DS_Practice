package com.practice.HackerRankQue;

class NewThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
}

public class Print100TimesUsingThread {
	public static void main(String[] args) throws InterruptedException {
		NewThread thread1=new NewThread();
		NewThread thread2=new NewThread();
		NewThread thread3=new NewThread();
		NewThread thread4=new NewThread();
		NewThread thread5=new NewThread();
		NewThread thread6=new NewThread();
		NewThread thread7=new NewThread();
		NewThread thread8=new NewThread();
		NewThread thread9=new NewThread();
		NewThread thread10=new NewThread();
		Thread t1=new Thread(thread1);
		Thread t2=new Thread(thread2);
		Thread t3=new Thread(thread3);
		Thread t4=new Thread(thread4);
		Thread t5=new Thread(thread5);
		Thread t6=new Thread(thread6);
		Thread t7=new Thread(thread7);
		Thread t8=new Thread(thread8);
		Thread t9=new Thread(thread9);
		Thread t10=new Thread(thread10);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		t5.start();
		t5.join();
		t6.start();
		t6.join();
		t7.start();
		t7.join();
		t8.start();
		t8.join();
		t9.start();
		t9.join();
		t10.start();
		t10.join();
		
		

	}

}
