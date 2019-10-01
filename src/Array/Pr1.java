package Array;

import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Pr1 {

	public static void main(String[] args) {
//		List<Integer> list= new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.set(list.size()-1,100);
//		//list.remove(list.size()-1);
//		System.out.println(list);
		
		
		//Map<Integer,String> map=new HashMap<>();
		Map<Integer,String> map=new ConcurrentHashMap<>();
		map.put(10,"Sakshi");
		map.put(20, "Minku");
		map.put(30,"Nonu");
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		for(Map.Entry<Integer,String> map1:set)
	    {
			System.out.println(map1.getKey()+" "+map1.getValue());
			map.put(60,"Nonin");
		}
//		Set<Integer> set1=map.keySet();
//		for(Integer i:set1)
//		{
//			System.out.println(i+" "+map.get(i));
//		}
//		Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry<Integer, String> map2=itr.next();
//			System.out.println(map2.getKey()+" "+map2.getValue());
//			map.put(40,"Babu");
//		}
		
		//System.out.println(map);
		

	}

}
