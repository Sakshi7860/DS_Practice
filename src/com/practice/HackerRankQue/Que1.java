package com.practice.HackerRankQue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Que1 {

	public static void main(String[] args) {
		int arr[]= {2,10,10,20,30,10};
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
		if(!map.containsKey(arr[i]))
			map.put(arr[i], 1);
		
		else
		{
			int value=map.get(arr[i]);
			value++;
			map.put(arr[i], value);
		}
		}
		Set<Integer> set=map.keySet();
		
		for(int i:set)
		{
			System.out.println(map.get(i));
		}

	}

}
