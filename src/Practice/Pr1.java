package Practice;

public class Pr1 {
	public int cal(int[] arr,int value)
	{
		int val=value;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				val=val*arr[i];
			}
		}
		return val;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,16,34};
		int b =2;
		Pr1 p=new Pr1();
		System.out.println(p.cal(arr,b));
		
		

	}

}
