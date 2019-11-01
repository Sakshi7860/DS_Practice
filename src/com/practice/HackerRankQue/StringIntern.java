package com.practice.HackerRankQue;

public class StringIntern {

	public static void main(String[] args) {
		String s=new String("Minku");
		String s1=new String("Minku").intern();
		System.out.println(s==s1);
		System.out.println(s1);

	}

}
