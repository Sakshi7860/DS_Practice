package DS;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,2,4,1,5,3};
		for(int i=1;i<arr.length;i++)
		{
			
			int temp=arr[i]; 
			int j=i;
			while(j>0 && arr[j-1]>temp )
			{	
				arr[j]=arr[j-1];
				j--;
				
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
