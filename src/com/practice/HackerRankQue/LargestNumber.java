package com.practice.HackerRankQue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//class LargestNumber { 
//	  
//    // The main function that prints the  
//    // arrangement with the largest value. 
//    // The function accepts a vector of strings     
//    static void printLargest(List<String> arr){ 
//      
//        Collections.sort(arr, new Comparator<String>(){ 
//  
//        // A comparison function which is used by  
//        // sort() in printLargest() 
//        @Override
//        public int compare(String X, String Y) { 
//          
//        // first append Y at the end of X 
//        String XY=X + Y; 
//          
//        // then append X at the end of Y 
//        String YX=Y + X; 
//          
//        // Now see which of the two formed numbers  
//        // is greater 
//        return XY.compareTo(YX) > 0 ? -1:1; 
//    } 
//    }); 
//        System.out.println(arr);
//          
////    Iterator it = arr.iterator(); 
////  
////    while(it.hasNext()) 
////        System.out.print(it.next()); 
//      
//    } 
//      
//    // driver program 
//    public static void main (String[] args) { 
//          
//        List<String> arr; 
//        arr = new ArrayList<>(); 
//          
//        //output should be 6054854654 
//        arr.add("54"); 
//        arr.add("546"); 
//        arr.add("548"); 
//        arr.add("60"); 
//        printLargest(arr); 
//    } 
//} 

public class LargestNumber {

   public static void printLargest1(List<String> list)
   {
	   Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				String A=o1+o2;
				String B=o2+o1;
				return B.compareTo(A);
			}});  
	   
	  for(String s:list)
		  System.out.print(s);
   }

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("54");
		list.add("546");
		list.add("548");
		list.add("60");
		printLargest1(list);
	}

}
