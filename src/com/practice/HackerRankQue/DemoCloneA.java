package com.practice.HackerRankQue;

import java.util.ArrayList;
import java.util.Collections;

class Demo2 implements Cloneable
{
	int i;
	ArrayList<DemoCloneB> b;
	public Demo2(int val, ArrayList<DemoCloneB> demo)
	{
		this.i=val;
		this.b=demo;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public ArrayList<DemoCloneB> getB() {
		//return (ArrayList<DemoCloneB>) Collections.unmodifiableCollection(b);
		return b;
	}
	public void setB(ArrayList<DemoCloneB> b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Demo2 [i=" + i + ", b=" + b + "]";
	}
	//@SuppressWarnings("unchecked")
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		
		Demo2 d= (Demo2) super.clone();
		d.b=(ArrayList<DemoCloneB>) b.clone();
		return d;
	}
	
}
public class DemoCloneA {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		DemoCloneB clone1=new DemoCloneB(101,"A");
		DemoCloneB clone2=new DemoCloneB(101,"B");
		ArrayList<DemoCloneB> list=new ArrayList<>();
		list.add(clone1);
		list.add(clone2);
 		Demo2 d=new Demo2(1,list);
 		Demo2 d1=(Demo2) d.clone();
 		d1.getB().add(new DemoCloneB(103, "C"));
 		System.out.println(d);
 		System.out.println(d1);
 		
 		
	
	}

}
