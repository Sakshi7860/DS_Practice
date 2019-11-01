package com.practice.HackerRankQue;

class Employee1 implements Cloneable
{
	int id;
	String name;
	AddressCopy add;
	public Employee1(int id,String name, AddressCopy add) {
		super();
		this.id = id;
		this.name=name;
		this.add=add;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee1 emp= (Employee1) super.clone();
		emp.add=(AddressCopy) add.clone();
		return emp;
	}

	public AddressCopy getAdd() {
		return add;
	}


	public void setAdd(AddressCopy add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", add=" + add + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

public class EmployeeCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 emp=new Employee1(101, "Minku",new AddressCopy("Patiala","123453"));
		Employee1 emp1=(Employee1) emp.clone();
		emp1.getAdd().setCity("sunam");
		System.out.println(emp);
		System.out.println(emp1);

	}

}
