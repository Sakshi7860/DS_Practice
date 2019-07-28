package Practice;

public class StaticPractice {
	static int x,y,z;
	static
	{
		System.out.println("Inside static block");
		x=10;
		y=20;
		z=30;
	}
	static void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	{
		System.out.println("Inside class");
	}
	public StaticPractice() {
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		System.out.println(x);;

	}

}
