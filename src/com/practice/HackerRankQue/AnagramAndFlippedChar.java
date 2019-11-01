package com.practice.HackerRankQue;

import java.util.List;

public class AnagramAndFlippedChar {

	public static void main(String[] args) {
		String str="anagram";
		String str1="grammar";
		int a[]=new int[256];
		int b[]=new int[256];
		if(str.length()!=str1.length())
		{
			System.out.println("not anagram");
		}
		for(int i=0;i<str.length()&& i<str1.length();i++)
		{
			a[str.charAt(i)]++;
			b[str1.charAt(i)]++;
		}
		 int count=0;
		for(int i1=0;i1<a.length;i1++)
		{
			if(a[i1]>b[i1])
			{
				System.out.println("print");
				count+=Math.abs(a[i1]-b[i1]);
			}
				
		}
		System.out.println(count);

	}

}
