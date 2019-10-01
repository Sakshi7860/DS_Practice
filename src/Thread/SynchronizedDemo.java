package Thread;

public class SynchronizedDemo {
	public static void main(String s[])
	{
		ThreadExercise t=new ThreadExercise(false);
		Thread1 t1=new Thread1(t,false);
		Thread1 t2=new Thread1(t,true);
		t1.start();
		t2.start();
	}

}
