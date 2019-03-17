package Practice;

public class test {
	public static void main(String[] args) {
		for(int i=4; i>=1;i--)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		for(int i=2; i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}
