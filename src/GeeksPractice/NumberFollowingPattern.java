package GeeksPractice;

import java.util.Stack;

public class NumberFollowingPattern {

	public static void main(String[] args) {
		String s="DDIID";
		String s1="";
		String s2="I.am.a.Girl";
		String str1[]=s2.split("\\.");
//		for(int j=0;j<str1.length;j++)
//			System.out.println(str1[j]);
		 for(int j1=str1.length-1;j1>0;j1--)
              s1+=str1[j1]+".";
          s1+=str1[0];å
          
         System.out.println(s1);
		Stack<Integer> stack=new Stack<>();
//		for(int i=0;i<=s.length();i++)
//		{
//			stack.push(i+1);
//			if(i==s.length() || s.charAt(i)=='I')
//			{
//				while(!stack.isEmpty())
//				{
//					s1+=stack.pop();
//				}
//			}
//		}
//		System.out.println(s1);

	}

}
