package com.practice.HackerRankQue;

class A
{
	 A()
	{	
		 System.out.println("Parent Constructor");
	}
	
	A(int i)
	{
		System.out.println("Parent constructor");
	}
}
 
class B extends A
{
	B()
	{
		System.out.println("child Constructor");
		
	}
	
	B(int i)
	{
		this();
		System.out.println("B");
	}
}

public class Inheritence {
	public static void main(String[] args) {
		B b =new B(10);
	}

}
