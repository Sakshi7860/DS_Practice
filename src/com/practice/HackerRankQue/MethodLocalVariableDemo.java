package com.practice.HackerRankQue;


class Outer1 { 
   void outerMethod() { 
      int x = 98; 
      System.out.println("inside outerMethod"); 
       class Inner { 
          void innerMethod() { 
            System.out.println("x= "+x); 
         } 
      } 
      Inner inner=new Inner();
      inner.innerMethod(); 
   } 
}

public class MethodLocalVariableDemo {

	public static void main(String[] args) {
		 Outer1 x=new Outer1(); 
	      x.outerMethod(); 

	}

}
