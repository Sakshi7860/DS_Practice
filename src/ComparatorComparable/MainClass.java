package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Employee emp1=new Employee(110,"Sakshi");
		Employee emp2=new Employee(153,"Golly");
		Employee emp3=new Employee(106,"Sarb");
		List<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.eid<o2.eid)
					return -1;
				else if(o1.eid>o2.eid)
					return 1;
				else
					return 0;
			}
		});
		System.out.println(list);
	

	}

}
