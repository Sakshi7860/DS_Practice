package DS;
public class LinkedList {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int val)
		{
			data=val;
			next=null;
		}
	}
	
	public void addNodeAtFirst(int value)
	{
		Node node=new Node(value);
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
	}
	
	public void addNodeAtLast(int value)
	{
		Node node =new Node(value);
		Node n=head;
		while(n.next!=null)
			n=n.next;
		n.next=node;
		
	}
	
	public void addNewNode(int position, int value)
	{
		if(position==1)
		{
			addNodeAtFirst(value);
		}
		else {
		Node n=head;
		int i=1;	
		while(i!=position-1)
		{
			n=n.next;
			i++;
		}
		Node node=new Node(value);
		node.next=n.next;
		n.next=node;
	}
	}
	
	public void deleteFirstNode()
	{
		head=head.next;
	}
	
	public void deleteLastNode() 
	{
		Node n=head;
		while(n.next.next!=null)
			n=n.next;
		n.next=null;
	}
	
	public void deleteNode(int position) 
	{
		Node node=head;
		int i=1;	
		while(i!=position-1)
		{
			node=node.next;
			i++;
		}
		node.next=node.next.next;
		
		
	}
	
	public void display() {
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	public void traverse(Node n)
	{
		if(n==null)
			return;
		System.out.println(n.data);
		traverse(n.next);
	}
	public void reversedisplay(Node n)
	{
		Node node=n;
		if(node.next!=null)
			reversedisplay(node.next);
		System.out.println(node.data);
	}
	public void reverseList(Node n) {
		Node prev=null;
		Node nxt=null;
		Node current=n;
		while(current!=null)
		{
			nxt=current.next;
			current.next=prev;
			prev=current;
			current=nxt;
			
		}
		head=prev;
		}
	public void reverseListByRecursion(Node n)
	{
		if(n.next==null) {
			head=n;
			return;
		}
		reverseListByRecursion(n.next);
		Node q=n.next;
		q.next=n;
		n.next=null;
		
		
	}
	public void swap(int data1, int data2)
	{
		if(data1==data2)
			return;
		Node n=head;
		Node temp=null;
		Node temp1=null;
		if(n.data==data1)
			temp=head;
		else if(n.data==data2)
			temp1=head;
		while(n.next!=null)
		{
			
			if(n.next.data==data1) {
				temp=n;
			}else if(n.next.data==data2) {
				temp1=n;
			}
			n=n.next;
			
		}
		
		swap1(temp,temp1);
	}
	void swap1(Node temp,Node temp1)
	{
	Node currX=temp.next;                                                                  ;
	Node nextNodeX=temp.next.next;
	Node currY=temp1.next;
	Node nextNodeY=temp1.next.next;
	temp.next=currY;
	currY.next=nextNodeX;
	temp1.next=currX;
	currX.next=nextNodeY;
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addNodeAtFirst(10);
		list.addNodeAtFirst(20);
		list.addNodeAtLast(100);
		list.addNewNode(2, 15);
		list.addNewNode(5,30);
		list.addNewNode(1, 12);
		//list.deleteNode(3);
		//list.deleteFirstNode();
		//list.deleteLastNode();
		list.display();
		System.out.println("--------------------");
		list.swap(12,100);
		list.display();
		//list.reverseList(list.head);
		//list.reverseListByRecursion(list.head);
		//list.display();
		//System.out.println("--------");
		//list.reversedisplay(list.head);
		//list.traverse(list.head);

	}

}
