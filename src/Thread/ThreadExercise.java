package Thread;

class ThreadExercise
{
	static boolean flag;
	public ThreadExercise(boolean flag) {
		this.flag=flag;
	}
	public synchronized void printEven(int number)throws InterruptedException
	{
		while(!flag)
		{
			wait();
		}
		System.out.println(number);
		flag=false;
		notify();
	}
	
	public synchronized void printOdd(int number) throws InterruptedException
	{
		while(flag)
		{
			wait();
		}
		System.out.println(number);
		flag=true;
		
		notify();
	}
}
