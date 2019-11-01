package com.practice.HackerRankQue;

import java.util.Scanner;
import java.util.Stack;

public class Parser {

	public static int applyOperation(char op, int b, int a)
	{
		switch(op)
		{
			case '+':
				return a+b;
			case '-':
				return a-b;
		}
		return 0;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scan =new Scanner(System.in);
		String str=scan.nextLine();
		String str1=str.replace(" ","");
		System.out.println(str1);
		Stack<Integer> values=new Stack<Integer>();
		Stack<Character> ops=new Stack<Character>();
		for(int i=0;i<str1.length();i++)
		{
			
			if(i%2==0 && Integer.parseInt(str1.charAt(i)+"")>0 && Integer.parseInt(str1.charAt(i)+"")<10)
			{
				values.push(Integer.parseInt(str1.charAt(i)+""));
			}
			else if(i%2!=0 && str1.charAt(i)=='+' || str1.charAt(i)=='-')
			{
				ops.push(str1.charAt(i));
			}
			else
			{
				throw new Exception("enter a valid input");
			}
			
		}
		while(!ops.empty())
		{
			values.push(applyOperation(ops.pop(),values.pop(),values.pop()));
		}
		
		System.out.println(values.pop());
		
	}

}
