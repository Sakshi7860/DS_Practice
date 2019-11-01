package com.practice.HackerRankQue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,3,3,4,4,5};
		
		//1st way to store values
//		Set<Integer> set=new HashSet<>();
//		for(int i=0;i<arr.length;i++)
//			set.add(arr[i]);
//		System.out.println(set);
		
		//2nd way
		
		int arr1[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr1[j]=arr[i];
				j++;
			}
			
		}
		for(int l=0;l<arr1.length;l++)
			System.out.println(arr1[l]);
		

	}

}
