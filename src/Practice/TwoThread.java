package Practice;
class thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("thread 1"+i);
		
	}
	
}
class thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("thread 2"+i);
		
	}
	
}

public class TwoThread {

	public static void main(String[] args) throws InterruptedException {
		thread1 t=new thread1();
		thread2 t1=new thread2();
		t.start();
		t.join();
		t1.start();
		

	}

}
