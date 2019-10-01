package Array;

import java.util.HashMap;
import java.util.Map;

public class CountSubSequence {

	public static void main(String[] args) {
		int arr[]= {6,2,4,1,5,3};
		int targetSum=6;
		Map<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int count=0;
		for(int n:arr)
		{
			sum+=n;
			if(sum==targetSum)
				count++;
			if(map.containsKey(sum-targetSum))
				count+=map.get(sum-targetSum);
			map.put(sum, map.getOrDefault(sum,0)+1);
		}
		System.out.println(count);
	}

}
