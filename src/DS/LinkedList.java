package DS;

import java.util.Stack;

public class LinkedList {
	Node head;
	class Node
	{
		String data;
		Node next;
		Node(String val)
		{
			data=val;
			next=null;
		}
	}
	
	public void addNodeAtFirst(String value)
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
	
	public void addNodeAtLast(String value)
	{
		Node node =new Node(value);
		Node n=head;
		while(n.next!=null)
			n=n.next;
		n.next=node;
		
	}
	
	public void addNewNode(int position, String value)
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
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addNodeAtFirst("R");
		list.addNewNode(2, "A");
		list.addNewNode(3, "F");
		list.addNewNode(4, "B");
		list.addNewNode(5, "R");
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
		System.out.println(list.isPalindrome(list.head));
		//list.display();
		//list.reverseList(list.head);
		//list.reverseListByRecursion(list.head);
		//list.display();
		//System.out.println("--------");
		//list.reversedisplay(list.head);
		//list.traverse(list.head);

	}

}
