package DS_practice;

public class InsertionSort {
	
	public static void main(String[] args) {
		

		int arr[]= {2,5,1,7,7,8,4,9};
		for(int i=1;i<arr.length;i++)
		{
			int val=arr[i];
			int hole=i;
			while(hole>0 && arr[hole-1]>val)
			{
				arr[hole]=arr[hole-1];
				hole--;
			}
			arr[hole]=val;
			
		}
		
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);
		

	}

}
