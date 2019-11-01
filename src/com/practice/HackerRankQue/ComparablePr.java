package com.practice.HackerRankQue;

import java.util.*;

class Employee implements Comparable<Employee>
{
	int rollNo;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public int compareTo(Employee e)
	{
		return this.rollNo-e.rollNo;
	}
	@Override
	public String toString() {
		return "Employee [rollNo=" + rollNo + ", name=" + name + "]";
	}
	}

//class ComparatorNew implements Comparator
//{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		return ((Employee) o1).getName().compareTo(((Employee) o2).getName());
//	}
//	
//}


public class ComparablePr {

	public static void main(String[] args) {
	 List<Employee> list=new ArrayList<>();
	 Employee emp=new Employee();
	 emp.setName("Sarb");
	 emp.setRollNo(101);
	 Employee emp1=new Employee();
	 emp1.setName("Sakshi");
	 emp1.setRollNo(102);
	 Employee emp2=new Employee();
	 emp2.setName("Sakshi");
	 emp2.setRollNo(102);
	 Employee emp3=new Employee();
	 emp3.setName("Minku");
	 emp3.setRollNo(104);
	 list.add(emp);
	 list.add(emp1);
	 list.add(emp2);
	 list.add(emp3);
	 Collections.sort(list, new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			int i= ((Employee) o1).getName().compareTo(((Employee) o2).getName());
			if(i==0)
			{
				Integer i1=o1.getRollNo();
				Integer i2=o2.getRollNo();
				return i1.compareTo(i2);
			}
			else
				return i;
		}
		 
		 
	});
	 System.out.println(list);
	}

}
