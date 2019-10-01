package DS;

import java.util.Stack;

public class StackPractice {
	
    
    
    /* print minimum element of the stack each time
       after popping*/
    static void _getMinAtPop(Stack<Integer> stack,Stack<Integer> stack1)
    {
        while(!stack.isEmpty())
        {
        if(stack.peek()==stack1.peek())
            {
                System.out.print(stack1.peek()+" ");
                stack.pop();
                if(stack1.size()!=1 || stack.size()<stack1.size())
                	stack1.pop();
            }
        else
        {
            System.out.print(stack1.peek()+" ");
            stack.pop();
        }
        }
    }

	public static void main(String[] args) {
		StackPractice pr= new StackPractice();
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> stack1=new Stack<>();
		stack.push(1);
		stack.push(6);
		stack.push(43);
		stack.push(1);
		stack.push(2);
		stack.push(0);
		stack.push(5);
		stack1.push(1);
		stack1.push(0);
		pr._getMinAtPop(stack, stack1);
		
		
		

	}

}
