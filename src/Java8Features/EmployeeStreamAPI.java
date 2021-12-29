package Java8Features;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeStreamAPI {

	public static void main(String[] args) {
		List<Employee> list= new ArrayList<>();
		list.add(new Employee(101, "Rohan", "IT", 20000));
		list.add(new Employee(105, "Sham", "CSE", 25000));
		list.add(new Employee(103, "Bimal", "CORE", 25000));
		list.add(new Employee(102, "Sourav", "CSE", 15000));
		Long noOfEmp=list.stream().filter(x -> x.getSalary()>=25000).count();
		System.out.println(noOfEmp);
		System.out.println("*********************");
		
		//Sort Method 1 (Sort by salary, if same then sort by ID desc)
		/*
		 * Collections.sort(list, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * if(o1.getSalary()>o2.getSalary()) return 1; else if
		 * (o1.getSalary()<o2.getSalary()) return -1; else { return
		 * o2.getId()-o1.getId(); } }
		 * 
		 * 
		 * });
		 */
		
		//lambda exp for sorting
//		Collections.sort(list,(o1,o2) -> (int)(o1.getSalary()-o2.getSalary()));
		
		//Use Stream API for sorting
		//(Ascending)
//		list.stream().sorted((o1,o2) -> (int)(o1.getId()-o2.getId())).forEach(System.out::println);
		
		//Descending
//		list.stream().sorted((o1,o2) -> (int)(o2.getId()-o1.getId())).forEach(System.out::println);
		
		//Stream Aoi using Comparing method
//		list.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
		
		System.out.println("==================");
		//Sort a map using String API
		
		//traditional approach method 1
		/*
		 * Map<String,Integer> map =new HashMap<>(); map.put("C", 101); map.put("B",
		 * 403); map.put("A", 203); map.put("D", 303);
		 * List<java.util.Map.Entry<String,Integer>> list2= new
		 * ArrayList<>(map.entrySet()); Collections.sort(list2, (o1,o2)->
		 * o1.getKey().compareTo(o2.getKey())); for(java.util.Map.Entry<String, Integer>
		 * entry: list2) { System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */
		
		//Usinf STream Api
		/*
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out
		 * ::println); System.out.println("===============");
		 * map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.
		 * out::println);
		 */
		
		//traditional Approach
		Map<Employee,Integer> map2= new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
		});
		map2.put(new Employee(101, "Rohan", "IT", 20000),30);
		map2.put(new Employee(105, "Sham", "CSE", 25000),40);
		map2.put(new Employee(103, "Bimal", "CORE", 25000),20);
		map2.put(new Employee(102, "Sourav", "CSE", 15000),10);
		
//		System.out.println(map2);
		map2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId).reversed())).
		forEach(System.out::println);
		
		

	}

}
