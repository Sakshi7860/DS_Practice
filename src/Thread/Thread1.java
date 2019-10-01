package Thread;

public class Thread1 extends Thread{
	
	ThreadExercise thread;
	boolean flag;
	
	Thread1(ThreadExercise t, boolean flag)
	{
		this.thread=t;
		this.flag=flag;
	}
	public void run()
	{
		int  number=flag==true?1:2;
		while(number<10)
		{
			if(flag)
			{
				try {
					thread.printOdd(number);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				try {
					thread.printEven(number);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			number+=2;
		}
	}

}
