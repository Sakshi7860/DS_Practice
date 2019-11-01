package com.practice.HackerRankQue;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,8,9,10};
		int n=10;
		int val=0;
		for(int i=1;i<=n;i++)
		{
			val=val^i;
		}
		for(int j=0;j<arr.length;j++)
			val=val^arr[j];
		System.out.println(val);

		String s="12a";
		if(s.contains("[a-z][A-Z])"))
			System.out.println("-1");
		
	}

}
