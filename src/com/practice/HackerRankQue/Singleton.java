package com.practice.HackerRankQue;

class SingletonPattern implements Cloneable
{
	private static SingletonPattern instance=null;
	public int x=5;
	
	private SingletonPattern()
	{
		System.out.println("Inside class");
	}
	
	public static SingletonPattern getInstance()
	{
		if(instance==null)
		{
			 instance=new SingletonPattern();
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}

public class Singleton {
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		SingletonPattern singleton=SingletonPattern.getInstance();
		SingletonPattern singleton1=(SingletonPattern) singleton.clone();
		System.out.println(singleton.hashCode());
		System.out.println(singleton1.hashCode());
	}
}
