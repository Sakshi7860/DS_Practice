package Exception;

public class ExceptionDemo {
	public int getMethod()
	{
		try
		{
			int a=5;
			int b=a/0;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 10;
			
		}
		finally
		{
			System.out.println("Finally");
		
		}
		
		return 200;
		
	}

	public static void main(String[] args) {
		ExceptionDemo demo=new ExceptionDemo();
		System.out.println(demo.getMethod());
		
		

	}

}
