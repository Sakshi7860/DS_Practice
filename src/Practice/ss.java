package Practice;

public class ss {
	public void sum (String ste)
	{
		System.out.println("method a");
	}
	public void sum (Object obj)
	{
		System.out.println("method a");
	}

	public static void main(String[] args) {
		ss s=new ss();
		int a=10;
		int b=20;
		s.sum(null);
		
		

	}

}
