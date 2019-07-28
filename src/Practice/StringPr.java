package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPr {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		for(int i=0;i<input;i++)
		{
		    int n=scan.nextInt();
		    int arr[]=new int[n];
		    boolean flag=true;
		    for(int i1=0;i1<n;i1++)
		    {
		        arr[i1]=scan.nextInt();
		    }
		    List<Integer> list=new ArrayList<>();
		    for(int j=0;j<arr.length;j++)
		    {
		        for(int k=j+1;k<arr.length;k++)
		        {
		            if(arr[j]>arr[k])
		               flag=true;
		             else
		                {
		                  flag=false;
		                  break;
		                }
		        }
		        if(flag)
		        {
		           list.add(arr[j]);
		        }
		        
		    }
		    System.out.println(list);
		}
//		Scanner scan=new Scanner(System.in);
//		int input=scan.nextInt();
//		for(int i=0;i<input;i++)
//		{
//		    int n=scan.nextInt();
//		    int arr[]=new int[n];
//		    for(int j=0;j<n;j++)
//		    {
//		        arr[j]=scan.nextInt();
//		    }
//		    int k=0;
//		    while(k<arr.length-1)
//		    {
//		        if(arr[k+1]<arr[k])
//		            arr[k]=arr[k+1];
//		        else
//		            arr[k]=-1;
//		        k++;
//		    }
//		    arr[arr.length-1]=-1;
//		    for(int l=0;l<arr.length;l++)   
//		        System.out.print(arr[l]+" ");
//		    System.out.println();
//		        
//		}
//		int arr[]= {13,15,4,7,2,1};
//		List<Integer> list=new ArrayList<>();
//		for(int j=0;j<arr.length;j++)
//	    {
//	        for(int k=j+1;k<arr.length-1;k++)
//	        {
//	            if(arr[k]>arr[j])
//	                break;
//	        }
//	        list.add(arr[j]);
//	        
//	    }
//		System.out.println(list);
	}
		
		
	
	}
		
