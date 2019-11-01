package com.practice.HackerRankQue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLengthWise {

	public static void main(String[] args) {
		String s="I am a girl and Engineer and lives in Bangalore";
		String str[]=s.split("\\s");
		List<String> list=new ArrayList<>();
		for(String s1:str)
			list.add(s1);
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String s2=(String)o1;
				String s3=(String)o2;
				if(s2.length()<s3.length())
					return 1;
				else if(s2.length()>s3.length())
					return -1;
				else
					return 0;
			}
			
		});
		System.out.println(list);

	}

}
