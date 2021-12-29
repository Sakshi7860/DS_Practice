package Practice;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=33;
		String num="";
	    while(n!=0)
	    {
	     num+=n%2; 
	      n=n/2;
	    }
	    System.out.println(num);

	}

}
