package com.practice.HackerRankQue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class NextLargestElement {

	public static void main(String[] args) {
		int arr[]= {13,7,6,12};
		Stack<Integer> stack=new Stack<>();
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++)
			map.put(arr[i], 0);
		stack.push(arr[0]);
		int i=1;
		while(i<arr.length)
		{
			if(arr[i]>stack.peek())
			{
				while(!stack.isEmpty() &&  arr[i]>stack.peek())
				{
					map.put(stack.peek(),arr[i]);
					stack.pop();
				}
				stack.push(arr[i]);
			}
			else
				stack.push(arr[i]);
			i++;
		}
		while(!stack.isEmpty())
		{
			map.put(stack.peek(), -1);
			stack.pop();
		}
		System.out.println(map);
	}

}
