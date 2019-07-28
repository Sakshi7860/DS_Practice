package Array;

interface A
{
	default void show()
	{
		System.out.println("A");
	}
}
interface B
{
	default void show()
	{
		System.out.println("B");
	}
}

class demo implements A,B
{
	public void print()
	{
		System.out.println("Inherited");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		A.super.show();
	}
}

public class DiamondProblem {

	public static void main(String[] args) {
		

	}

}
