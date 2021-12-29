package DS_practice;

import java.util.HashSet;
import java.util.Set;

public class Snippet {
	public static void main(String[] args) {
		String S="geek";
		char c[]=S.toCharArray();
		char ch[]=S.toCharArray();
		Set<String> set =new HashSet<>();
//        set.add(S);
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
            	if(i!=j)
            	{
	            	char temp=c[i];
	            	c[i]=c[j];
	            	c[j]=temp;
            	}
            	System.out.println(c);
            	set.add(String.valueOf(c));
            	System.out.println(ch);
            	c=ch.clone();
            }
           
            
        }
        System.out.println(set);
        System.out.println(set.size());
		
	
	}
}

