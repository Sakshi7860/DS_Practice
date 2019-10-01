package Practice;

public class Overloading1 {

	public static void main(String[] args) {
		Overloading1 over=new Overloading1();
		over.display(5);
		

	}
	public void display(Integer i) {
		System.out.println("Inside Integer");
	}
	public void display(Long l)
	{
		System.out.println("Inside Long");
	}

}
