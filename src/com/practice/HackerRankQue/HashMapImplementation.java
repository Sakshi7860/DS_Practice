package com.practice.HackerRankQue;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

class Student
{
	int id;
	String name;
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
	@Override
	public int hashCode()
	{
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Student std=(Student) obj;
		return (this.id==std.id && this.name.equals(std.name));
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class HashMapImplementation {

	public static void main(String[] args) {
		HashMap<Student,String> map=new HashMap<>();
		Student s=new Student();
		s.setId(10);
		s.setName("Sakshi");
		Student s1=new Student();
		s1.setId(10);
		s1.setName("Sakshi");
		map.put(s,"A");
		map.put(s1, "B");
		System.out.println(map);
	
		

	}

}
