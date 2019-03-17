package Practice;
class Demo{
	
	public int a=10; 
	public void show()
	{
		System.out.println("A");
	}
}

public class Demo2 extends Demo {
	private int a=20;
	public void show()
	{
		System.out.println("B");
	}

	public static void main(String[] args) {
		Demo d=new Demo2();
		System.out.println(d.a);
		d.show();

	}

}
