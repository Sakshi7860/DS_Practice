package com.practice.Patterns;

public class Prototype implements Cloneable{
	
	Prototype()
	{
		System.out.println("added");
	}
	@Override
	public String toString() {
		return "Prototype [id=" + id + ", name=" + name + ", type=" + type + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	int id;
	String name;
	String type;
	
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
	
}
