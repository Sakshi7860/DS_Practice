package DS;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,4,1,5,3};
		for(int j=0;j<arr.length-1;j++)
		{
			int min=j;
			
		for(int i=j+1;i<arr.length;i++)
		{
			if(arr[i]<arr[min])
			{
				min=i;
			}
		}
		int temp=arr[j];
		arr[j]=arr[min];
		arr[min]=temp;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
