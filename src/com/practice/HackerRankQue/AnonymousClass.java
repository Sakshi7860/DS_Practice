package com.practice.HackerRankQue;

interface demo
{
	public void sum();
}
//class demo1 implements demo
//{
//
//	@Override
//	public void sum() {
//		System.out.println("sum print");
//		
//	}
//	
//}

public class AnonymousClass {
	public static void main(String[] args) {
		demo d=() -> System.out.println("sum print");
//		demo d=new demo()
//		{
//			public void sum()
//			{
//				System.out.println("sum print");
//			
//			
//			}
//		};
//		
		d.sum();
		

	}

}
