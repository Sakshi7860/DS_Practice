package Practice;
import java.io.*; 
import java.util.*; 
  
class Anagram { 
	
	
	
	//(Use Sorting)
//	 static boolean areAnagram(char[] str1, char[] str2) 
//	    { 
//	        // Get lenghts of both strings 
//	        int n1 = str1.length; 
//	        int n2 = str2.length; 
//	  
//	        // If length of both strings is not same, 
//	        // then they cannot be anagram 
//	        if (n1 != n2) 
//	            return false; 
//	  
//	        // Sort both strings 
//	        Arrays.sort(str1); 
//	        Arrays.sort(str2); 
//	  
//	        // Compare sorted strings 
//	        for (int i = 0; i < n1; i++) 
//	            if (str1[i] != str2[i]) 
//	                return false; 
//	  
//	        return true; 
//	    } 
//  
    static int NO_OF_CHARS = 256; 
  
    /* function to check whether two strings 
    are anagram of each other */
    static boolean areAnagram(char str1[], char str2[]) 
    { 
        // Create 2 count arrays and initialize 
        // all values as 0 
        int count1[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count1, 0); 
        int count2[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count2, 0); 
        int i; 
  
        // For each character in input strings, 
        // increment count in the corresponding 
        // count array 
        for (i = 0; i < str1.length && i < str2.length; 
             i++) { 
            count1[str1[i]]++; 
            count2[str2[i]]++; 
        } 
  
        // If both strings are of different length. 
        // Removing this condition will make the program 
        // fail for strings like "aaca" and "aca" 
        if (str1.length != str2.length) 
            return false; 
  
        // Compare count arrays 
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count1[i] != count2[i]) 
                return false; 
  
        return true; 
    } 
  
    /* Driver program to test to print printDups*/
    public static void main(String args[]) throws ClassNotFoundException 
    { 
        char str1[] = ("geeksforgeeks").toCharArray(); 
        char str2[] = ("forgeeksgeeks").toCharArray(); 
  
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + "anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
} 
  