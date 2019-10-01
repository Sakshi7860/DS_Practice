package Multithreading;

public class Printer {
	boolean value=false;
	
	public synchronized void printOdd(int number) throws InterruptedException
	{
		while(value)
		{
			wait();
		}
		System.out.println(number);
		value=true;
		notifyAll();
		
		
	}
	public synchronized void printEven(int number) throws InterruptedException
	{
		
		while(!value)
		{
			wait();
		}
		System.out.println(number);
		value=false;
		notifyAll();
		
	}

}
