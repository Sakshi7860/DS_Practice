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
		 
		 System.out.println("***********");
		 List<Integer> list=Arrays.asList(1,2,3,4,5);
		 System.out.println(list.stream().mapToInt(i -> i).sum());
		 
		 Integer val=list.stream().reduce(Integer::sum).get();
		 System.out.println(val);
		 
		 list.stream().forEach(i-> System.out.println(i));
		 
		System.out.println(list.stream().map(i -> i*2).reduce(0,(Integer a, Integer b)->a+b));
		
		System.out.println(list.stream().filter(i -> i%5==0).reduce(0,Integer::max));
		
		 
				
			
	}			

}
