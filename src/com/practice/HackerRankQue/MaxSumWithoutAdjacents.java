package com.practice.HackerRankQue;

import java.util.Scanner;

public class MaxSumWithoutAdjacents {

	public static int max(int a, int b)
    {
        return a>b?a:b;
    }
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int inputs=scan.nextInt();
		for(int i=0;i<inputs;i++)
		{
		    int val=scan.nextInt();
		    int arr[]=new int[val];
		    for(int j=0;j<arr.length;j++)
		    {
		        arr[j]=scan.nextInt();
		    }
		    int incl=arr[0];
		    int excl=0;
		    for(int k=1;k<arr.length;k++)
		    {
		        int temp=incl;
		        incl=arr[k]+excl;
		        excl=max(temp,excl);
		    }
		    if(incl>excl)
		        System.out.println(incl);
		    else
		        System.out.println(excl);
		    
		}
	}

}
