package com.practice.HackerRankQue;

import java.util.Stack;

public class StackQueDI {

	public static void main(String[] args) {
		String s="DDIDDIID";
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<=s.length();i++)
		{
			stack.push(i+1);
			if(i==s.length() || s.charAt(i)=='I')
			{
				while(!stack.isEmpty())
				{
					System.out.print(stack.pop());
				}
			}
		}
		

	}

}
