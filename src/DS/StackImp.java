package DS;

import java.util.Stack;

public class StackImp {

	public Stack<Integer> deleteMid(Stack<Integer> s, int sizeOfStack, int current) {

		// 1st method
		/*
		 * int mid=-1; if(sizeOfStack%2==0) mid=sizeOfStack/2; else
		 * mid=(sizeOfStack/2)+1; System.out.println(mid); int count=1; Stack<Integer>
		 * stack = new Stack<>(); while(count !=mid && !s.isEmpty()) {
		 * stack.push(s.pop()); count++; } s.pop(); while(!stack.isEmpty()) {
		 * s.push(stack.pop()); } return s;
		 *
		 * 
		 * 
		 * // code here }
		 */

		// System.out.println("Size is "+ sizeOfStack+" "+(sizeOfStack)/2);
		if (current == (sizeOfStack) / 2) {
			s.pop();
			return s;
		}

		int temp = s.peek(); //
		System.out.println("Peek value is " + temp);
		s.pop();
		s = deleteMid(s, sizeOfStack, current + 1);
		System.out.println("Stack is " + s);
		s.push(temp);
		return s;

	}

	public static void main(String s[]) {
		StackImp imp = new StackImp();
		Stack<Integer> stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(imp.deleteMid(stack, 5, 0));

	}

}
