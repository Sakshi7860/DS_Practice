package com.practice.Patterns;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Prototype p=new Prototype();
		p.setId(101);
		p.setName("P131");
		p.setType("type");
		Prototype p1=(Prototype) p.clone();
		System.out.println(p1);
		

	}

}
