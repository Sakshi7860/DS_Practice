package Array;
class outer
{
		public int a=10;
		public void show()
		{
			class inner
			{
				public void show()
				{
					System.out.println(a);
				}
				
			}
			inner in=new inner();
			in.show();
			
		}
	 class demo{
			public void print()
			{
				System.out.println("sakshi");
			}
		}
	}

public class Inner {

	public static void main(String[] args) {
		outer out=new outer();
		out.show();
		outer.demo out1=new outer().new demo();
		out1.print();
		
		
		class test
		{
			public void show1()
			{
				System.out.println("hello");
			}
		}
		test t=new test();
		t.show1();

	}

}
