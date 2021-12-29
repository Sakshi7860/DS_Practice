package Practice;

public class MathFun {

	public static void main(String[] args) {
		
		int A=3;
		int B=3;
		int k=1;
        double c1=Math.pow(A,B);
        int count=0;
        double num=0;
        System.out.println(c1);
        int c=(int)c1;
        System.out.println(c);
        while(c!=0 && count<k)
        {
            
            num=c%10;
            c=c/10;
            count++;
        }
        System.out.println(num);

	}

}
