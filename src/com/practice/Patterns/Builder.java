package com.practice.Patterns;

public class Builder {
	int id;
	String name;
	String add;
	public Builder(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Builder [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	

}
