package com.practice.HackerRankQue;

public class FibonacciByDPBottomUP {

	public static void main(String[] args) {
		int n=5;
		int a[]=new int[n+1];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=n;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		for(int j=0;j<a.length;j++)
			System.out.println(a[j]);
		
	}

}
