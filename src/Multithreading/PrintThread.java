package Multithreading;

class ThreadP extends Thread {
	Printer printer;
	boolean flag;
	public ThreadP(Printer p, boolean flag) 
	{
		printer=p;
		this.flag=flag;
	}
	
	public void run()
	{
		int number=flag==true?1:2;
		while(number<=10)
		{
			if(flag)
			{
				try {
					printer.printOdd(number);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				try {
					printer.printEven(number);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			number+=2;
			
		}
	}
	

}
public class PrintThread
{
	public static void main(String[] args) {
		Printer p=new Printer();
		ThreadP t=new ThreadP(p, true);
		ThreadP t2=new ThreadP(p, false);
		t.start();
		t2.start();
		
		
	}
}
