package DS;
class Merge
{
	public void merge(int[] arr1)
	{
		int length=arr1.length;
		if(length<2)
			return;
		int mid=length/2;
		int[] left=new int[mid];
		int[] right=new int[length-mid];
		for(int i=0;i<mid;i++)
		{
			left[i]=arr1[i];
		}
		for(int j=mid;j<length;j++)
			right[j-mid]=arr1[j];
		merge(left);
		merge(right);
		merge_sort(arr1,left,right);
		
	}
	public void merge_sort(int arr2[], int [] left, int [] right)
	{
		int i=0,j=0,k=0;
		int nl=left.length;
		int rl=right.length;
		while(i<nl && j<rl)
		{
			if(left[i]<right[j])
			{
				arr2[k]=left[i];
				i++;
				
			}
			else
			{
				arr2[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<nl)
		{
			arr2[k]=left[i];
			i++;
			k++;
		}
		while(j<nl)
		{
			arr2[k]=right[j];
			j++;
			k++;
		}
	}
}

public class Merge_Sort {
	public static void main(String[] args) {
		Merge m=new Merge();
		int arr[]= {9,-1,2,5,7,1,0,4,-2,2,6};
		m.merge(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		

	}

}
