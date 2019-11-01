package com.practice.HackerRankQue;

public class WIndowSlidingProblem {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,4,5,2,3,6};
		int k=3;
		for(int i=0;i<=arr.length-k;i++)
		{
			int max=arr[i];
			for(int j=i+1;j<i+k;j++)
			{
				if(arr[j]>max)
					max=arr[j];
			}
			System.out.print(max+" ");
		}
		

	}

}
