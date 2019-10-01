package Java8Features;

import java.util.Arrays;
import java.util.List;

interface Demo
{
	public void show();
}

public class LambdaExp {

	public static void main(String[] args) {
		Demo d;
//		d= new Demo()  //Anonymous class
//				{
//				public void show()
//				{
//					System.out.println("Print");
//				}
//				};
		d=() -> System.out.println("print");  //lambda expression
		 d.show();
		 
		 List<Integer> list=Arrays.asList(1,2,3,4,5);
		 list.stream().forEach(i-> System.out.println(i));
		System.out.println(list.stream().map(i -> i*2).reduce(0,Integer::sum));
		System.out.println(list.stream().filter(i -> i%5==0).reduce(0,Integer::sum));
		
		 
				
			
	}			

}
