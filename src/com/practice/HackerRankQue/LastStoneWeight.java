package com.practice.HackerRankQue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,7,4,1,8,1);
		
	       
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        for (int i = 0; i < list.size(); i++) {
	            pq.offer(list.get(i));
	        }
	        System.out.println(pq);
	        while (pq.size() > 1) {
	            int first = pq.poll();
	            int second = pq.poll();
	            if (first != second) {
	                int rem = Math.abs(first - second);
	                pq.offer(rem);
	            }
	        }
	        System.out.println( pq.size()==1 ? pq.poll() : 0);
	    
	}
}
