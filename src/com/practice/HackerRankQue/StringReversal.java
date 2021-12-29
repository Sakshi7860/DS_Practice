package com.practice.HackerRankQue;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringReversal {

	public static void main(String[] args) {
		String s="GEEKS FOR GEEKS";
		String str1="";
		int arr[]= new int[26];
		System.out.println(arr[0]);
		for(int i=s.length()-1;i>=0;i--)
		{
			
			if(s.charAt(i)==' ')
				continue;
			if(arr[s.charAt(i)-65]==0)
			{
				str1+=s.charAt(i);
				
				
			}
			
			arr[s.charAt(i)-65]++;
			
			
			
		}
		System.out.println(str1);
		
	}

}
