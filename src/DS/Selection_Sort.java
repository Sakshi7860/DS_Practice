package DS;

public class Selection_Sort {

	public static void main(String[] args) {
		int arr[]= {5,3,8,1,9,7,0};
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
		for(int i1=0;i1<arr.length;i1++)
			System.out.print(arr[i1]+" ");

	}

}
