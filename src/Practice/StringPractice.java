package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPractice {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.get(list.size()-1);
		Map<Integer,Integer> map=new HashMap<>();
		map.put(10,101);
		map.put(20, 102);
		map.put(30, 103);
		if(map.containsKey(10))
		{
			
			System.out.println(map.get(10));
		}
		//System.out.println(map);
		
//		String a=new String("ABC");
//		String b=new String("ABC");
//		String c="ABC";
//		String d="ABC";

	}

}
