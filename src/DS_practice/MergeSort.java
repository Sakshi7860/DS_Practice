package DS_practice;

public class MergeSort {
	
	public void mergeSorting(int[] left, int[] right, int[] arr)
	{
		int k=0;
		int l=0;
		int r=0;
		int ll=left.length;
		int rl=right.length;
		while(l<ll && r<rl) 
		{
			if(left[l]<=right[r])
			{
				arr[k]=left[l];
				l++;
				k++;
			}
			else if(right[r]<left[l])
			{
				arr[k]=right[r];
				r++;
				k++;
				
			}
		}
		while(l<ll)
		{
			arr[k]=left[l];
			k++;
			l++;
		}
		while(r<rl)
		{
			arr[k]=right[r];
			k++;
			r++;
		}
	}
	
	public void merging(int[] arr) {
		int length=arr.length;
		int mid=length/2;
		if(length<2)
			return;
		int left[]=new int[mid];
		int right[]=new int[length-mid];
		for(int i=0;i<mid;i++)
			left[i]=arr[i];
		for(int j=mid;j<length;j++)
			right[j-mid]=arr[j];
		merging(left);
		merging(right);
		mergeSorting(left,right,arr);
		
		
		
	}

	public static void main(String[] args) {
		MergeSort sort= new MergeSort();
		int arr[]= {4,-3,8,8,6,1,0,-7,9};
		sort.merging(arr);
		for(int m=0;m<arr.length;m++)
		{
			System.out.println(arr[m]);
		}
		

	}

}
