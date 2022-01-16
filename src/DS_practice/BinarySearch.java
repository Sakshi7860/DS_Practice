package DS_practice;

public class BinarySearch {

	public int findNum(int[] arr,int number) {
		
		int low=0;
		int high=arr.length-1;
		int n=7;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==n)
			{
				return 1;
			}
			else if(n<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;

	}
	
	public int findNumUsingRecursion(int[] arr,int low, int high, int number)
	{
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(arr[mid]==number)
			return 1;
		else if(number<arr[mid])
			return findNumUsingRecursion(arr,low,mid-1,number);
		else
			return findNumUsingRecursion(arr, mid+1, high, number);
			
		
	}
	
public int findIndex(int[] arr,int number, boolean start) {
		
		int low=0;
		int high=arr.length-1;
		int index=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==number)
			{
				if(start)
				{
					index=mid;
					high=mid-1;
				}
				else
				{
					index=mid;
					low=mid+1;
				}
				
			}
			else if(number<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		}
		return index;

	}
	
	public int countNum(int arr[], int number)
	{
		int start=findIndex(arr, number,true);
		int end= findIndex(arr, number,false);
		int count=0;
		for(int i=start;i<=end;i++)
			count++;
		return count;
	}
	
	public int noOfTimesRotation(int arr[])
	{
		int low=0;
		int high=arr.length-1;
		int n=arr.length;
		
		while(low<=high)
		{
		if(arr[low]<=arr[high])
			return low;
		int mid=(low+high)/2;
		int prev=(mid+n-1)%n;
		int next=(mid+1)%n;
		if(arr[mid]<arr[prev] && arr[mid]<arr[next])
			return mid;
		else if(arr[mid]<=arr[high])
		{
			high=mid-1;
			
		} 
		else 
		{
			low=mid+1;
		}
		}
		return -1;
		
		
		
	}
	
	public int searchElementInCircularList(int[] arr, int element)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==element)
				return mid;
			else if(arr[low]<=arr[mid])
			{
				if(element>=arr[low] && element<=arr[mid])
					high=mid-1;
				else
					low=mid+1;
				
			} 
			else if(arr[mid]<=arr[high])
			{
				if(element>=arr[mid] && element<=arr[high])
					low=mid+1;
				else
					high=mid-1;
				
			}
		}
		return -1;
		
	}
	
		
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		//int arr[]= {2,5,7,9,10,14,20};
		//int arr[]= {2,2,3,4,4,4,5,5,6,7,7,7,7,7};
		int arr[]= {11,12,15,18,2,5,6,8};
		//System.out.println(bs.findNum(arr, 0));
		//System.out.println(bs.findNumUsingRecursion(arr, 0, arr.length, 2));
//		System.out.println(bs.countNum(arr, 5));
//		System.out.println(bs.noOfTimesRotation(arr));
		System.out.println(bs.searchElementInCircularList(arr,4));
	
	}
		

}
