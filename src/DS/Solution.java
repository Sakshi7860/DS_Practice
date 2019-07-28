package DS;


import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		String s="xyz";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	       Stack<Integer> stack=new Stack<>();
	       int n=scan.nextInt();
	       for(int i=0;i<n;i++)
	       {
	           int op=scan.nextInt();
	           
	           if(op==1)
	           {
	        	   int val=scan.nextInt();
	                stack.push(val);
	           }
	           else if(op==2)
	           {
	               stack.pop();
	           }
	           else if(op==3)
	           {
	               Stack<Integer> stack1=new Stack<>();
	                int max=Integer.MIN_VALUE;
	                while(!stack.isEmpty())
	                {
	                int a=(int)stack.peek();
	                if(a>max)
	                    max=a;
	                stack1.push(stack.pop());
	                }
	                while(!stack1.isEmpty())
	                {
	                    stack.push(stack1.pop());
	                }
	                System.out.println(max);
	            }
	        }

	}

}
