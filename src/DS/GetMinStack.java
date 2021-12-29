package DS;

import java.util.Stack;

public class GetMinStack {
	
	 public static Stack<Integer> _push(int arr[],int n)
	    {
	        Stack<Integer> st =new Stack<>();
	        for(int i=0;i<n;i++)
	        {
	            st.push(arr[i]);
	        }
	        return st;
	        
	    }
	 
	 public static int min(Stack<Integer> s)
	    {
	        int x=s.peek();
	        while(s.size()!=1)
	        {
	            s.pop();
	            if(s.peek()<x)
	                x=s.peek();
	        }
	        
	        return x;
	        
	        
	        
	    }
	
	 static void _getMinAtPop(Stack<Integer>s)
	    {
		   Stack<Integer> stackCopy= new Stack<>();
		   stackCopy.addAll(s);
	        while(!s.isEmpty())
	        {
	            System.out.print(min(stackCopy)+" ");
	            s.pop();
	        }
	        
	            
	        
	        
	    }

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Stack<Integer> stack=_push(arr,5);
		_getMinAtPop(stack);
		// TODO Auto-generated method stub

	}

}
