package com.practice.HackerRankQue;

class Parent
{
	public void print()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	public void print()
	{
		System.out.println("Child class");
	}
}

//class Child2 extends Parent
//{
//	public void print()
//	{
//		System.out.println("Child2 class");
//	}
//}

public class ClassCastException {

	public static void main(String[] args) {
		Parent p1=new Parent();
		Parent p=new Child();
//		Parent p2=new Child2();
		Child child=new Child();
		Child ch=(Child) p;
		ch.print();
		//Child chd= new  Child2();
		//Child ch1=(Child) p1;
//		ch.print();
//		ch1.print();
		

	}

}
