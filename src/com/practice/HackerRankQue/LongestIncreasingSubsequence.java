package com.practice.HackerRankQue;

import java.util.List;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[]= {10, 9, 2, 5, 3, 7, 101, 18};
		int lis[]=new int[arr.length];
		for(int i=0;i<lis.length;i++)
			lis[i]=1;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && lis[j]+1>lis[i])
				{
					lis[i]++;
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<lis.length;i++)
		{
			if(lis[i]>max)
				max=lis[i];
		}
		System.out.println(max);
		

	}

}
