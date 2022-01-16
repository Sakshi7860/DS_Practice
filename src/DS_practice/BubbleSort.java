package DS_practice;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,2,0,8,1,9,6};
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==false)
				break;
		}

		for(int l=0;l<arr.length;l++)
			System.out.println(arr[l]);
	}

}
