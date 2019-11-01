package com.practice.HackerRankQue;

import java.util.Scanner;

public class ReverseWordInGivenString {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int val=scan.nextInt();
		//scan.nextLine();
		for(int j=0;j<val;j++)
		{
		String s=scan.nextLine();
		String str[]=s.split("\\.");
		String str1="";
		for(int i=str.length-1;i>=0;i--)
		{
		    if(i!=0)
		    {
		         str1+=str[i];
		         str1+=".";
		    }
		    else
		    {
		        str1+=str[i];
		    }
		    
		}
		System.out.println(str1);
		
	}
	
	}

}
