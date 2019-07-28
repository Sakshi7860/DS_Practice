package Practice;
class Myrunnable implements Runnable
{
	public void run()
	{
		System.out.println("Mythread");
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThredPractice {

	public static void main(String[] args) {
		Myrunnable myrunnable=new Myrunnable();
		Thread t=new Thread(myrunnable);
		t.setName("Child Thread");
		System.out.println(t.currentThread().getName());
		System.out.println(t.getName());
		t.start();
		System.out.println(t.currentThread());
		

	}

}
