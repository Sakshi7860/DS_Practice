package com.practice.multithreading;

class PrintClass {
	boolean flag;
	
	public PrintClass(boolean flag) {
		// TODO Auto-generated constructor stub
		this.flag = flag;
		
	}
	
	public synchronized void printOdd(int n) throws InterruptedException {
		if(flag) {
			this.wait();
		}
		System.out.println(n);
		flag = true;
		this.notify();
	}
	
	public synchronized void printEven(int n) throws InterruptedException {
		if(!flag) {
			this.wait();
		}
		System.out.println(n);
		flag= false;
		this.notify();
	}
	
}

class SampleThread extends Thread{
	PrintClass p;
	int count;
	int initialValue;
	public SampleThread(PrintClass p, int start, int last) {
		// TODO Auto-generated constructor stub
		this.p = p;
		this.count = last;
		this.initialValue = start;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(this.initialValue<=this.count) {
			if(this.initialValue%2==0) {
				try {
					this.p.printEven(this.initialValue);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				try {
					this.p.printOdd(this.initialValue);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.initialValue+=2;			
		}

	}
}



public class Main extends Thread {

	public static void main(String[] args) {
		PrintClass print = new PrintClass(false);
		SampleThread oddThread = new SampleThread(print, 1, 10);
		SampleThread evenThread = new SampleThread(print, 2, 10);
		oddThread.start();
		evenThread.start();
		
	}

}

