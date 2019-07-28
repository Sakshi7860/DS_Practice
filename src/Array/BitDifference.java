package Array;

public class BitDifference {
	int sunBitDifferences(int arr[],int n)
	{
		int ans=0;
		for(int i=0;i<32;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if((arr[j]) && (1 << i))
					count++;
				
			}
			ans+=(count*(n-count)*2);
			
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[]= {1,3,5};
		BitDifference bt=new BitDifference();
		bt.sunBitDifferences(arr, 3);
		
		
	}

}
