package com.practice.HackerRankQue;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,7,5};
		int num=12;
		int left=0;
		int right=0;
		int sum=0;
		
		while(sum!=num && right<arr.length && left<arr.length)
		{
			if(sum<num)
			{
				sum+=arr[right];
				right++;
			}
			else
			{
				sum-=arr[left];
				left++;
			}
		}
		System.out.println("left index is:"+left+" "+"Right index is:"+right);

	}
}
