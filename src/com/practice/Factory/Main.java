package com.practice.Factory;

public class Main {

	public static void main(String[] args) {
		//OS os=new Windows();
		OS os=new FactoryClass().getObject("Mac");
		os.specs();

	}

}
