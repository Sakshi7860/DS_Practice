package com.practice.HackerRankQue;

import java.util.Scanner;

public class SortingOf012 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int val=scan.nextInt();
		for(int i=0;i<val;i++)
		{
		    int num=scan.nextInt();
		    int arr[]=new int[num];
		    for(int j=0;j<arr.length;j++)
		    {
		        arr[j]=scan.nextInt();
		    }
		    int l=0;
		    int m=0;
		    int n=arr.length-1;
		    while(m<=n)
		    {
		        
		        if(arr[m]==0)
		        {
		        	if(arr[l]!=0)
		        	{
		            int temp=arr[l];
		            arr[l]=arr[m];
		            arr[m]=temp;
		            l++;
		            m++;
		        	}
		        	else
		        	{
		        		l++;
		        		m++;
		        	}
		        }
		        else if(arr[m]==1)
		        {
		            m++;
		        }
		        else if(arr[m]==2)
		        {
		        	if(arr[n]!=2)
		        	{
		            int temp=arr[m];
		            arr[m]=arr[n];
		            arr[n]=temp;
		            n--;
		        	}
		        	else
		        	{
		        	n--;
		        	}
		      }
		    }
		    for(int i1=0;i1<arr.length;i1++)
		        System.out.print(arr[i1]+" ");
		    
		    System.out.println("");
		}

	}

}
