package Exception;

public class FinalDemo {
	public static int print()
	{
		try
		{
			int a=10/0;
			System.out.println("in main");
		}
		catch(Exception e)
		{
			System.out.println("in catch block");
			return 1;
		}
		finally {
			return 2;
		}

	}

	public static void main(String[] args) {
		System.out.println(FinalDemo.print());
	}

}
