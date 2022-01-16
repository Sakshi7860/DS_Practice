package DS_practice;

public class Queue {
	int front;
	int rear;
	int arr[];
	int capacity;
	Queue(int size)
	{
		arr=new int[size];
		front=0;
		rear=-1;
		capacity=size;
	}

	public void enqueue(int data)
	{
		
		if(isFull()) 
			System.exit(-1);
		 arr[++rear]=data;
		
	}
	
	public void dequeue()
	{
		if(isEmpty())
			System.exit(-1);
		int data=arr[front++];
		//System.out.println(data);
		
		
	}
	
	public void display()
	{
		for(int i=0;i<=rear;i++)
		{
			System.out.println(arr[i]);
			
		}
	}
	
	public boolean isEmpty()
	{
		return front==rear+1?true:false;
	}
	
	public boolean isFull()
	{
		return rear==capacity?true:false;
		
	}
	public static void main(String[] args) {
		Queue queue =new Queue(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		queue.display();
		

	}

}
