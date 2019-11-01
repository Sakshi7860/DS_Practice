package com.practice.HackerRankQue;

import java.util.HashSet;
import java.util.Iterator;

public class ConcurrentHashMap {

	public static void main(String[] args) {
		HashSet<Integer> set =new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			set.add(50);
		}

	}

}
