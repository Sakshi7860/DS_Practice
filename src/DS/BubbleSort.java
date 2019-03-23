package DS;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,4,1,5,3};
		for(int i=0;i<arr.length-1;i++)
		{	
			int count=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					count++;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(count==0)
				break;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
