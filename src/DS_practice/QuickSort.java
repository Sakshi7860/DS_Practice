package DS_practice;

public class QuickSort {
	
	public int partition(int arr[], int start, int end)
	{
		int pivot=arr[end];
		int pindex=start;
		for(int i=start;i<end;i++)
		{
			if(arr[i]<=pivot)
			{
				int temp=arr[i];
				arr[i]=arr[pindex];
				arr[pindex]=temp;
				pindex++;
			}
		}
		int temp=arr[pindex];
		arr[pindex]=arr[end];
		arr[end]=temp;
		return pindex;
	
	}
	
	public void sorting(int[] arr, int start, int end)
	{
		if(start>=end)
			return;
		int pindex=partition(arr,start,end);
		sorting(arr,start,pindex-1);
		sorting(arr,pindex+1,end);
		
		
	}

	public static void main(String[] args) {
		QuickSort sort=new QuickSort();
		int arr[]= {5,2,3,1,-7,8,0,3};
		sort.sorting(arr,0, arr.length-1);
		
		for(int l=0;l<arr.length;l++)
			System.out.println(arr[l]);
	

	}

}
