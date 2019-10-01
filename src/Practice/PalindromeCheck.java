package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PalindromeCheck {

	public static void main(String[] args) {
		String s="cricket";
		char c[]=s.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<c.length;i++)
		{
			if(!map.containsKey(c[i]))
				map.put(c[i],1);
			else
			{
				int value=map.get(c[i]);
				value=value+1;
				map.put(c[i], value);
			}
				
		}
		System.out.println(map);
		boolean flag=false;
		boolean isPalindrome=true;
		Set<Character> set=map.keySet();
		for(char c1:set)
		{
			if(map.get(c1)%2!=0 && flag==false)
			{
				flag=true;
				isPalindrome=true;
			}
			else if(map.get(c1)%2!=0 && flag==true)
			{
				isPalindrome=false;
				break;
				
			}
		}
		if(isPalindrome)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

}
