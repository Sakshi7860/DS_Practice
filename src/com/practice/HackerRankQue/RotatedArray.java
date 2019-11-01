package com.practice.HackerRankQue;

public class RotatedArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int r=2;
		int temp=0;
		while(r>0)
		{
			temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			
				
				arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		r--;
		}
		for(int j=0;j<arr.length;j++)
			System.out.println(arr[j]);

	}

}
