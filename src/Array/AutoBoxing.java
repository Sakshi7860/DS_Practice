package Array;

public class AutoBoxing {
	
//	public void print(int i)
//	{
//		System.out.println("print i");
//	}
//	
//	public void print(Integer i)
//	{
//		System.out.println("print integer");
//	}

	public void printS(String s)
	{
		System.out.println("String s");
	}
//	public void printS(Object s)
//	{
//		System.out.println("Object s");
//	}
	public void printS(StringBuffer s)
	{
		System.out.println("StringBuffer s");
	}
//	public void printS(StringBuilder s)
//	{
//		System.out.println("StringBuilder s");
//	}

	public static void main(String[] args) {
		AutoBoxing auto=new AutoBoxing();
		auto.printS("Gollu");
		//auto.printS(new StringBuffer("Saksi"));
		

	}

}
