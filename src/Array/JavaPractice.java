package Array;

import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaPractice {

	public static void main(String[] args) {
		
	    String regex = "[ ]*";
	    String proposedName="This  is my account";
	    Pattern pattern = Pattern.compile(regex);
	    System.out.println(pattern);
	     Matcher matcher = pattern.matcher(proposedName);
	     	     System.out.println(matcher);
	   String resultPname = matcher.replaceAll("");
		System.out.println(resultPname);
		//String ignoreExpression=IGNORE_EXPRESSION_CLOSING.trim()+IGNORE_EXPRESSION_OPENING.trim();
		//System.out.println(ignoreExpression);
		
		
//		TreeSet<String> treeSet = new TreeSet<>(); 
//		  
//        treeSet.add("Geeks"); 
//        treeSet.add("for"); 
//        treeSet.add("Geeks"); 
//        treeSet.add("GeeksforGeeks"); 
//  
//        for (String temp : treeSet) 
//            System.out.printf(temp + " "); 
//		try {
//			throw new IOException("Hello");
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}

	}

}
