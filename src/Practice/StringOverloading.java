package Practice;

public class StringOverloading {
	
	
//	public void print(StringBuffer s)
//	{
//		System.out.println("Inside 2nd method");
//	}
//	
	public void print(String s)
	{
		System.out.println("Inside 1st method");
	}
	
	public void print(Object s)
	{
		System.out.println("Inside 3rd method");
	}

	public static void main(String[] args) {
		StringOverloading over=new StringOverloading();
		over.print(null);

	}

}
