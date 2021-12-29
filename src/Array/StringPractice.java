package Array;

public class StringPractice {

	public static void main(String[] args) {
		String s="sakshi";
		String s1=s;
		s="Gupta";
		System.out.println(s+" "+s1);
		String str1=new String("ABC");
		String str2=new String(str1);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(123+"456");
//		if(str1==str2)
//			System.out.println("equal");
//		else
//			System.out.println("not equal");
		

	}

}
