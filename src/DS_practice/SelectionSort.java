package DS_practice;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,3,6,8,2,1,9};
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min=arr[i];
			int index=-1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					index=j;
				}
			}
			if(arr[i]!=min)
			{
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			}
		}
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);

	}

}
