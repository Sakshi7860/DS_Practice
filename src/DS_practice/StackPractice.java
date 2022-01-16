package DS_practice;

public class StackPractice {
	
	public java.util.Stack<Integer> sort(java.util.Stack<Integer> s)
	{
		java.util.Stack<Integer> s1=new java.util.Stack<>();
		while(!s.isEmpty())
		{
		    int a=s.pop();
		    if(s1.isEmpty())
		        s1.push(a);
		    else
		    {
		    	int b=s1.peek();
		    	if(a<b)
		    	{
		    		while(a<b && !s1.isEmpty())
		    		{
		    			s.push(s1.pop());
		    		}
		    	}
		    
		    	s1.push(a);
		    	
		    }
		  
		}
		return s1;
	}
	
	public void deleteMid(java.util.Stack<Integer>s,int sizeOfStack){
        int mid=-1;
	        if(sizeOfStack%2==0)
	        	mid=(sizeOfStack/2);
	        else
	        	mid=(sizeOfStack/2)+1;
        int count=1;
        System.out.println(mid);
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        while(count !=mid && !s.isEmpty())
        {
            stack.push(s.pop());
            count++;
        }
        s.pop();
        while(!stack.isEmpty())
        {
            s.push(stack.pop());
        }
        
        
        // code here
    } 

	public static void main(String[] args) {
		StackPractice sp=new StackPractice();
		java.util.Stack<Integer> s= new java.util.Stack<>();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		sp.deleteMid(s,4);
		System.out.println(s);
//		s.push(11);
//		System.out.println(sp.sort(s));

	}

}
