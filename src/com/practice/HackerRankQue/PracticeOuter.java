package com.practice.HackerRankQue;

class Outer
{
	int j=20;
	 
	 public void print()
	 {
		 int l=30;
	System.out.println("Outer method");
	class Inner
	{
		 int i=10;
		 public void show()
		{
			System.out.println(j+ " "+l);
		}
		
	}
	Inner in=new Inner();
	in.show();
	
	 }
	
}

public class PracticeOuter {

	public static void main(String[] args) {
		Outer out=new Outer();
		out.print();

	}

}
