package com.practice.HackerRankQue;

public class MaxSumIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[]= {1,101,2,3,100,4,5};
		int lis[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
			lis[i]=arr[i];
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && lis[j]+arr[i]>lis[i])
					lis[i]=lis[j]+arr[i];
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i1=0;i1<lis.length;i1++)
		{
			if(lis[i1]>max)
				max=lis[i1];
		}
		System.out.println(max);
	}

}
