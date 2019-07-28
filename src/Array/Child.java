package Array;
class Parent
{
	public void display()
	{
		System.out.println("Parent");
	}
	public void increment()
	{
		System.out.println("Incremented");
	}
}
public class Child extends Parent{
	public void display()
	{
		System.out.println("Child");
	}
	public void decrement()
	{
		System.out.println("decremented");
	}
	public static void main(String[] args) {
		Parent pr=new Child();
		((Child)(pr)).decrement();
		pr.display();
		pr.increment();
		
	}
}
