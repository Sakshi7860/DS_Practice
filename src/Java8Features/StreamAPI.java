package Java8Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) throws IOException {

		List<String> list = Arrays.asList("Sakshi", "Sahil", "Minku", "Goldy", "Golly", "Shan");
		List<String> list1 = list.stream().filter(x -> x.startsWith("S")).map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(list1);

		Stream<String> lines = Files.lines(Paths.get("E:\\DS_Practice\\src\\Java8Features\\demo.text"));
		Map<String, String> map1 = lines.map(x -> x.split(",")).filter(x -> x.length == 3)
				.collect(Collectors.toMap(x -> x[0], x -> x[2]));
		for (String key : map1.keySet()) {
			System.out.println(key + " " + map1.get(key));
		}
		System.out.println("==================");
		
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.entrySet().stream().map(x-> x.getKey()*2).
		filter((a)-> a%3==0).
		forEach(System.out::println);
		
		System.out.println("================");
		map.forEach((a,b)-> System.out.println(a+": "+b));

	}

}
