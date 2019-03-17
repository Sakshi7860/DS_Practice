package Practice;
public class Demo3 {
	public static void main(String[] args) {
		String a="abc";
		System.out.println(a.hashCode());
		String c=a;
		System.out.println(c.hashCode());
		a="def";
		System.out.println(a.hashCode()); 
		String d="abc";
		System.out.println(d.hashCode());
		System.out.println(a);
		System.out.println(d);
		}

}
