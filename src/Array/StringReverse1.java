package Array;

public class StringReverse1 {

	public static void main(String[] args) {
		String s="a,Bc$dL";
		String str[]=s.split("");
		int start=0;
		int end=str.length-1;
		String str1="";
		while(start<end)
		{
			if(!str[start].matches("[a-zA-Z]"))
				start++;
			else if(!str[end].matches("[a-zA-Z]"))
				end--;
			else
			{
				String temp=str[start];
				str[start]=str[end];
				str[end]=temp;
				start++;
				end--;
			}
		}
		
		for(int j=0;j<str.length;j++)
			str1+=str[j];
		System.out.println(str1);
				
	}

}
