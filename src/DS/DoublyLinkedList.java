package DS;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int val)
		{
			data=val;
			prev=null;
			next=null;
		}
		
	}
	public void addAtFirst(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			head.prev=node;
			node.next=head;
			head=node;
			
		}
	}
	public void addAtLast(int data)
	{
		Node node=head;
		while(node.next!=null)
			node=node.next;
		Node n=new Node(data);
		node.next=n;
		n.prev=node;
	}
	
	public void addNode(int position,int data)
	{
		Node n=head;
		int i=1;	
		while(i!=position-1)
		{
			n=n.next;
			i++;
		}
		Node node=new Node(data);
		n.next.prev=node;
		node.next=n.next;
		n.next=node;
		node.prev=n;
		
	}
	
	public void deleteAtFirst()
	{
		Node n=head;
		n.next.prev=null;
		head=n.next;
		
	}
	
	public void deleteAtLast()
	{
		Node n=head;
		while(n.next.next!=null)
			n=n.next;
		n.next=null;
	}
	
	public void deleteNode(int position, Node n)
	{
		int i=1;
		Node head=n;
		while(i!=position)
		{
			head=head.next;
			i++;
		}
		Node next_node=head.next;
		Node prev_node=head.prev;
		prev_node.next=next_node;
		next_node.prev=prev_node;
		//delete(head);
		
	}
	
	public void display() {
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public void reverseDisplay(Node n)
	{
		if(n.next==null)
		{
			head=n;
			System.out.println(head.data);
			return;
		}
		reverseDisplay(n.next);
		System.out.println(n.data);
	}

	public void reverseLinkedList(Node n)
	{
		Node node =n;
		while(node.next!=null)
			node=node.next;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.prev;
		}
		
	}
	
	public void reverseList(Node n)
	{
		Node node=n;
		Node temp=null;
		while(node!=null)
		{
			 temp=node.prev;
			 node.prev=node.next;
			 node.next=temp;
			 node= node.prev;
		}
		if(temp!=null)
			temp=temp.prev;
		head=temp;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list=new DoublyLinkedList();
		list.addAtFirst(10);
		list.addAtFirst(20);
		list.addAtLast(100);
		list.addNode(3,30);
		//list.deleteAtLast();
		//list.deleteAtFirst();
		
		System.out.println("------------");
		//list.reverseDisplay(list.head);
		//list.deleteNode(3, list.head);
		list.display();
		System.out.println("********");
		//list.reverseDisplay(list.head);
		list.reverseLinkedList(list.head);
		

	}

}
