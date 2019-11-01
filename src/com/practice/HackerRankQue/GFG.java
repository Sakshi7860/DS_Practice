package com.practice.HackerRankQue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int val=scan.nextInt();
		for(int i=0;i<val;i++)
		{
		    int n=scan.nextInt();
		    System.out.println("Element is: "+n);
		    int arr[]=new int[n];
		    for(int j=0;j<arr.length;j++)
		    {
		        arr[j]=scan.nextInt();
		       
		    }
		     System.out.println("hello "+arr.length);
		    List<Integer> list=new ArrayList<>();
		    for(int s=0;s<arr.length;s++)
		        System.out.print("Elements in array"+arr[s]+" ");
		    int max=arr[n-1];
		    System.out.println("Max Elements is: "+max);
		    list.add(max);
		    System.out.println(list);
		    for(int k=n-2;k>=0;k--)
		    {
		        if(arr[k]>=max)
		        {
		            list.add(arr[k]);
		            max=arr[k];
		        }
		        System.out.println("After adding"+list);
		    }
		    for(int l=list.size()-1;l>=0;l--)
		        System.out.print(list.get(l)+" ");
		    System.out.println(" ");
		    
		}

	}

}
