package com.practice.Patterns;

public class BuilderImpl {
	int id;
	String name;
	String add;
	public BuilderImpl setId(int id) {
		this.id = id;
		return this;
	}
	public BuilderImpl setName(String name) {
		this.name = name;
		return this;
	}
	public BuilderImpl setAdd(String add) {
		this.add = add;
		return this;
	}
	public Builder getObject()
	{
		return new Builder(id,name,add);
	}
}
