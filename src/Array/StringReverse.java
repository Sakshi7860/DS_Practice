package Array;

public class StringReverse {

	public static void main(String[] args) {
		String s="a,bc$d";
		String s1="";
		char c[]=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		while(start<end)
		{
			if(!Character.isAlphabetic(c[start]))
				start++;
			else if(!Character.isAlphabetic(c[end]))
				end--;
			else
			{
				char temp=c[start];
				c[start]=c[end];
				c[end]=temp;
				start++;
				end--;
			}
			
		}
		for(int i=0;i<c.length;i++)
			s1+=c[i];
		System.out.println(s1);
		

	}

}
