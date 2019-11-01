package com.practice.HackerRankQue;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String s="GeeksforGeeks";
		char c[]=new char[256];
		for(int i=0;i<s.length();i++)
		{
			System.out.println(c[s.charAt(i)]);
			c[s.charAt(i)]++;
		}
		for(int i=0;i<c.length;i++)	
		{
			if(c[i]==1)
			{
				System.out.println((char)i);
				break;
			}
		}
		

	}

}
