package Array;

public class ArrayRotation {
	
	public static void main(String[] args) {
		int arr[]= {3,7,1,8,4,5};
		int d=1;
		int arr1[]=new int[arr.length];
		int k=0;
		//For left Rotation by d step 
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i+d<arr.length)
//			{
//				arr1[i]=arr[i+d];
//			}
//			else
//			{
//				arr1[i]=arr[k];
//				k++;
//				
//			}
//		}
		
		//For Right Rotation by d step
		for(int i=0;i<arr.length;i++)
		{
			
			if((i+(arr.length-d))<arr.length)
				arr1[i]=arr[i+(arr.length-d)];
			else
			{
				arr1[i]=arr[k];
				k++;
			}
				
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr1[i]);
			
		
		
		
			
	}

}
