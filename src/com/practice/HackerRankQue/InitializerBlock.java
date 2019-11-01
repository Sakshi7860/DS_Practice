package com.practice.HackerRankQue;

public class InitializerBlock {
	InitializerBlock(int x) 
    { 
        System.out.println("ONE argument constructor"); 
    } 
  
	InitializerBlock() 
    { 
        System.out.println("No  argument constructor"); 
    } 
  
    static
    { 
        System.out.println("1st static init"); 
    } 
  
    { 
        System.out.println("1st instance init"); 
    } 
  
    { 
        System.out.println("2nd instance init"); 
    } 
  
    static
    { 
        System.out.println("2nd static init"); 
    } 
  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InitializerBlock();
		System.out.println("---------");
		new InitializerBlock(10);

	}	

}
