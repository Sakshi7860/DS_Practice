package com.practice.HackerRankQue;

abstract class Animal
{
	 Animal() {
		System.out.println("Animal");
	}
	abstract void sound();
	
}

public class AbstractClass extends Animal{
	
	AbstractClass() {
		System.out.println("In child Class");
		
	}
	@Override
	void sound() {
		System.out.println("WOOFO");
		
	}
	public static void main(String[] args) {
		

	}

	

}
