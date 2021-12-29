package Java8Features;
//FunctionalInterface
interface lambda{
	//Example 1
//	void show();
	
	//example 2
//	void show(String s);
	
	//example 3
	void show(String a, String b);
	
}

//Traditionalapproach
/*
 * class lambdaImpl implements lambda { public void show() {
 * System.out.println("my lambda example"); } }
 */

public class LambdaDemo {

	public static void main(String[] args) {
		//Traditional approach
		/*
		 * lambda l= new lambdaImpl(); l.show();
		 */
		//Example 1
		/*
		 * lambda l=() -> System.out.println("my lambda example"); //lambda expression
		 * l.show();
		 */
		
		//Example 2
		/*
		 * lambda l = (s) -> System.out.println(s); l.show("sakshi");
		 */
		
		//Example 3
		lambda l =(a,b) -> System.out.println(a+b);
		l.show("Sakshi", " Gupta");
	}

}
