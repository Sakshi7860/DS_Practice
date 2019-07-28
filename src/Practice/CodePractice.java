package Practice;

import java.util.HashSet;
import java.util.Set;

public class CodePractice {

	public static void main(String[] args) {
		int arr[]= {3,7,10,6,2};
		int k=17;
		if(arr.length<2)
			return;
		Set set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			int target=k-arr[i];
			if(!set.contains(target))
				set.add(arr[i]);
			else
				System.out.println(arr[i]+" "+target);
			
		}
		

	}

}
