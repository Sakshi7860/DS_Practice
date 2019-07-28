package DS;

public class Insertion_sort {

	public static void main(String[] args) {
		int arr[]= {9,27,4,14,2,0,6,1};
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int hole=i-1;
			while(hole>=0 && arr[hole]>temp)
			{
				arr[hole+1]=arr[hole];
				hole=hole-1;
			}
			arr[hole+1]=temp;
		}
		for(int i1=0;i1<arr.length;i1++)
			System.out.print(arr[i1]+" ");

	}

}
	