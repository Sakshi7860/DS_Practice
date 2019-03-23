package DS;

import java.util.Scanner;

public class BinarySearch {
	
	public int search(int arr[], int value)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if (arr[mid]==value)
				return mid;
			else if(value <arr[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,13,21,36,47,63,81,97};
		BinarySearch bs=new BinarySearch();
		System.out.println(bs.search(arr,2));
//		int arr[]=new int[9];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<arr.length;i++)
//		{
//		System.out.println("enter the integer value");
//		int a=scan.nextInt();
//		arr[i]=a;
//		}
//		for(int i=0;i<9;i++)
//		 System.out.print(arr[i]+" ");
		
			
			
		
	}

}
