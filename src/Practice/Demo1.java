package Practice;

public class Demo1 {
	public boolean isPalindrome(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<(c.length)/2;i++)
	        {
	           if(Character.toLowerCase(c[i])==Character.toLowerCase(c[c.length-1-i]))
	        	   continue;
	           else 
	        	   return false;
	}
		return true;
	}

	public static void main(String[] args) {
		String s="Deleveled";
		Demo1 demo=new Demo1();
		System.out.println(demo.isPalindrome(s));
		
	                
	            
	    }
	        
	        
	        
		

	

}
