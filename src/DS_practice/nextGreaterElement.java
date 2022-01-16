package DS_practice;

import java.util.Stack;

public class nextGreaterElement {
	
	public static long[] nextLargerElement(long[] arr, int n)
    { 
        java.util.Stack<Long> stack =new Stack<>();
        long[] arr1=new long[n];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                stack.push(arr[i]);
                arr1[i]=-1;
            }
            else
            {
                if(stack.peek()>arr[i])
                {
                    arr1[i]=stack.peek();
                    stack.push(arr[i]);
                }
                else
                {
                    while(!stack.isEmpty() && stack.peek()<arr[i])
                    {
                        stack.pop();
                    }
                    if(stack.isEmpty())
                    {
                        arr1[i]=-1;
                        
                    
                    }
                    else
                    {
                        arr1[i]=stack.peek();
                        
                    }
                    stack.push(arr[i]);
                }
                
            }
        }
    
        return arr1;
    }

	public static void main(String[] args) {
		long arr[]= {6,8,0,1,3};
		nextGreaterElement ge=new nextGreaterElement();
		long[] result=ge.nextLargerElement(arr, 5);
		for(int n=0;n<result.length;n++)
			System.out.println(result[n]);
		

	}

}
