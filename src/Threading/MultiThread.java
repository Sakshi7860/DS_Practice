package Threading;
class Demo extends Thread
{
	
	public void run()
	{
		System.out.println("A");
	}
}
public class MultiThread {

	public static void main(String[] args) {
		Demo d=new Demo();
		Demo d1=new Demo();
		d.start();
		d1.start();
		
		
		

	}

}
