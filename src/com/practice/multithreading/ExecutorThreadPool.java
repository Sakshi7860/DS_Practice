package com.practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Printing values");
	}
	
}
public class ExecutorThreadPool {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++)
		{
			executorService.execute(new Task());
		}

	}

}
