package DS;

import java.util.Stack;

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
	public boolean isPalindrome(Node n)
	{
		Stack slack=new Stack();
		Node node=n;
		while(node!=null)
		{
			slack.push(node.data);
			node=node.next;
		}
		
		while(n!=null)
		{
			if(!slack.pop().equals(n.data))
				return false;
			n=n.next;
			
		}
		return true;
	}
	
	public void LengthOfList(Node n)
	{
		Node node=n;
		Node p=node;
		Node q=node;
		while(true)
		{
			p=p.next.next;
			if(p==null) {
				System.out.println("even");
				break;
			}
			else if(p.next==null) {
				System.out.println("odd");
				break;
			}
			
		}
	}
	public void swapInPairs(Node n)
	{
		Node prev=null;
		Node current=null;
		current=n;
		int i=1;
		while(current!=null)
		{
			if(i%2==0)
			{
				Node temp=current.next;
				current.next=prev;
				prev.next=temp;
				if(i==2)
					head=current;
				prev=current;
				prev=prev.next;
			}
			else
			{
			prev=current;
			current=current.next;
			i++;
		}
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addNodeAtFirst(1);
		list.addNewNode(2, 3);
		list.addNewNode(3, 2);
		list.addNewNode(4, 3);
		list.addNewNode(5, 5);
		list.addNewNode(6, 4);
		list.addNodeAtLast(5);
//		LinkedList list2=new LinkedList();
//		list2.addNodeAtFirst("M");
//		list.addNewNode(2, "N");
//		list.addNewNode(3, "E");
//		list.addNewNode(4, "E");
		//list.addNodeAtLast("G");
//		list.addNodeAtFirst(10);
//		list.addNodeAtFirst(20);
//		list.addNodeAtLast(100);
//		list.addNewNode(2, 15);
//		list.addNewNode(5,30);
//		list.addNewNode(1, 12);
		//list.deleteNode(3);
		//list.deleteFirstNode();
		//list.deleteLastNode();
		list.display();
		System.out.println("--------------------");
		//System.out.println(list.isPalindrome(list.head));
		//list.LengthOfList(list.head);
		list.swapInPairs(list.head);
		list.display();
		//list.display();
		//list.reverseList(list.head);
		//list.reverseListByRecursion(list.head);
		//list.display();
		//System.out.println("--------");
		//list.reversedisplay(list.head);
		//list.traverse(list.head);

	}

}
