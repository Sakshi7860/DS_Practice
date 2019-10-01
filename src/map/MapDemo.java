package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(10,11);
		map.put(11, 12);
		map.put(12, 13);
		Set<Integer> set=map.keySet();
		for(int i:set)
		{
			System.out.println(map.get(i));
			System.out.println(i==10);
			if(i==10)
			{
				map.put(12,30);
			}
		}
		System.out.println(map);
		

	}

}
