package CustomClass;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomClassImpl {

	public static void main(String[] args) {
		Set<Employee_1> set=new TreeSet<>();
		Employee_1 emp=new Employee_1();
		emp.setEcity("Bangalore");
		emp.setEname("Sakshi");
		emp.setEno(108);
		Employee_1 emp1=new Employee_1();
		emp1.setEcity("Bangalore");
		emp1.setEname("Sakshi");
		emp1.setEno(108);
		Employee_1 emp2=new Employee_1();
		emp2.setEcity("Bangalore");
		emp2.setEname("Sakshi");
		emp2.setEno(108);
		set.add(emp1);
		set.add(emp);
		set.add(emp2);
//		set.add(emp);
		System.out.println(set);
		

	}

}
