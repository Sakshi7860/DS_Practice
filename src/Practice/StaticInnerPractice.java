package Practice;

class Outer
{
//	static class Inner
//	{
//		public void show()
//		{
//			System.out.println("Print");
//		}
//	}
	class Inner
	{
		public void show()
		{
			System.out.println("Print");
		}
	}
}

public class StaticInnerPractice {

	public static void main(String[] args) {
		//Outer out =new Outer();
		Outer.Inner inn= new Outer().new Inner();
		inn.show();

	}

}
