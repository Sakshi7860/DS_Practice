package com.practice.HackerRankQue;

interface foo
{
	default void print()
	{
		System.out.println("print A");
	}
}

interface poo
{
	default void print()
	{
		System.out.println("print B");
	}
}

class C implements foo,poo
{
	@Override
	public void print()
	{
		foo.super.print();
	}
}

public class MultipleinheritenceWithClasses {
	public static void main(String[] args) {
		C c=new C();
		c.print();
}
}
