package com.practice.Factory;

public class FactoryClass {
	public OS os;
	public OS getObject(String str)
	{
		if(str.equals("Windows"))
			os= new Windows();
		else if(str.equals("Mac"))
			os=new Mac();
		return os;
	
	}
	
}
