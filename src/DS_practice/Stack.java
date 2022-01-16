package DS_practice;

public class Stack {
	int arr[];
	int top;
	int capacity;
	
	Stack(int size)
	{
		arr= new int[size];
		top=-1;
		capacity=size;
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("stack is full");
			
		}
		else
		{
			arr[++top]=data;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			return arr[top--];
		}
	
		
	}
	
	public int peek()
	{
		if(top==-1)
			System.exit(-1);
		
		return arr[top];
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
			
		}
	}
	
	public boolean isFull()
	{
		return top==capacity-1?true:false;
		
	}
	
	public boolean isEmpty()
	{
		return top==-1?true:false;
	}

	public static void main(String[] args) {
		Stack stack =new Stack(2);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		//stack.display();
//		stack.pop();
//		stack.display();
//		System.out.println(stack.peek());
		stack.display();
		
		// TODO Auto-generated method stub

	}

}
