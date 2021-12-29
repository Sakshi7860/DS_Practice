package DS;

import java.util.Stack;

public class maxLargerElementStack {
	
	public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> stack = new Stack<>();
        long[] arr1= new long[n];
        for(int i=n-1;i>=0;i--)
            stack.push(arr[i]);
        
        Stack<Long> stackAll=new Stack<>();
        
        int j=0;
        while(j<n && !stack.isEmpty())
        {
        	stackAll.addAll(stack);
            arr1[j]=getMax(stackAll);
            j++;
            stack.pop();
        }
        arr1[n-1]=-1;
        return arr1;
    } 
    
    
    public static long getMax(Stack<Long> s)
    {
        boolean flag=false;
        long temp=s.peek();
        while(s.size()!=1)
        {
            s.pop();
            if(s.peek()>temp)
            {
                temp=s.peek();
                flag=true;
                break;
                
                
            }
            else
            {
                flag=false;
            }
        }
        return flag==true?temp:-1;
        
    }

	public static void main(String[] args) {
		long arr[]= {1,3,2,4};
		long arr1[]= nextLargerElement(arr, 4);
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
	}

}
