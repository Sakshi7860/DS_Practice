package Array;

import java.util.HashMap;
import java.util.Map;


public class MapExercise {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("sakshi", 121);
		map.put("minku", 122);
		map.put("minku", 3330);
		map.put("golly", 123);
		map.replace("sakshi", 3000);
		System.out.println(map);

	}

}
