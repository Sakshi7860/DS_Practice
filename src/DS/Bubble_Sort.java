package DS;

public class Bubble_Sort {

	public static void main(String[] args) {
		int arr[]= {0,5,8,1,7,3,9};
		for(int i=0;i<arr.length-1;i++)
		{
			int count=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("after "+(i+1)+" passes");
				break;
			}
				
			
		}
		for(int i1=0;i1<arr.length;i1++)
			System.out.print(arr[i1]+" ");
		

	}

}
