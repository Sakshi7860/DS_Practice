package com.practice.HackerRankQue;
class Ballon
{
	private String color;
	public Ballon() {}
	
	public Ballon(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
public class CallByValue {

	public static void main(String[] args) {
		Ballon red=new Ballon("Red");
		Ballon blue=new Ballon("Blue");
		System.out.println("before change"+red.hashCode() +"  "+ blue.hashCode());
		swap(red,blue);
		System.out.println("After change"+red.hashCode() + "  "+ blue.hashCode());
		System.out.println("red color="+red.getColor());
		System.out.println("blue color="+blue.getColor());
		foo(blue);
		System.out.println("blue color="+blue.getColor());
		
		

	}
	
	private static void foo(Ballon ballon)
	{
		ballon.setColor("Red");
		ballon=new Ballon("Green");
		ballon.setColor("Blue");
	}
	
	public static void swap(Object o1, Object o2)
	{
		System.out.println(o1.hashCode()+" "+o2.hashCode());
		Object temp=o1;
		//System.out.println(temp.hashCode());
		o1=o2;
		o2=temp;
		System.out.println("after swap"+ o1.hashCode()+" "+o2.hashCode());	
	}

}
