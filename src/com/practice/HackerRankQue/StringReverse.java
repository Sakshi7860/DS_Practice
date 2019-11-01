package com.practice.HackerRankQue;

public class StringReverse {
	
	public static void main(String s[])
	{
		char ch='\u0000';
		String str="Sakshil";
		if(str.length()==2)
			System.out.println("string is already reversed");
		char c[]=str.toCharArray();
		for(int l=0;l<(c.length)/2;l++)
		{
			char temp=c[l];
			c[l]=c[c.length-l-1];
			c[c.length-l-1]=temp;
			
			
		}
		String str1="";
		for(int k=0;k<c.length;k++)
		{
			str1+=c[k];
		}
		System.out.println(str1);
		if(ch=='\u0000')
			System.out.println("print");
	}
	

}
