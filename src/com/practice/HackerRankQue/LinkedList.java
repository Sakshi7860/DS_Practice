package com.practice.HackerRankQue;

public class LinkedList {
	Node root;
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
	
	public void addNode(int value)
	{
		Node node=new Node(value);
		if(root==null)
			root=node;
		else
		{
			Node node1=root;
			while(node1.next!=null)
				node1=node1.next;
			node1.next=node;
		}
		
	}
	
	public void deleteAtLast()
	{
		Node node=root;
		while(node.next.next!=null)
			node=node.next;
		node.next=null;
	}
	
	public void addFirst(int value) {
		Node node1=new Node(value);
		Node node=root;
		root=node1;
		node1.next=node;
		
	}
	 
	public void deleteFirst()
	{
		root=root.next;
		
	}
	
	public void addMiddle(int value, int position)
	{
		if(position==1)
			addFirst(value);
		else
		{
		Node node=root;
		int count=1;
		while(node!=null && count<position-1)
		{
			node=node.next;
			count++;
		}
		if(node==null)
			return;
		else
		{
			Node node1=new Node(value);
			node1.next=node.next;
			node.next=node1;
		}
		}
	}
	
	public void removeMiddle(int position)
	{
		if(position==1)
			deleteFirst();
		else
		{
		Node node=root;
		int count=1;
		while(count<position-1)
		{
			node=node.next;
			count++;
		}
		node.next=node.next.next;
		}
	}
	
	public void display(Node root)
	{
		Node node=root;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	public Node reverseLinkedList(Node node)
	{
		Node prev=null;
		Node Next=null;
		Node current=node;
		while(current!=null)
		{
			Next=current.next;
			current.next=prev;
			prev=current;
			current=Next;
		}
		node=prev;
		return node;
		
	}
	
	public Node reverseKNodes(Node node,int k)
	{
		Node prev=null;
		Node Next=null;
		Node current=node;
		int count=0;
		while(current!=null && count<k )
		{
			Next=current.next;
			current.next=prev;
			prev=current;
			current=Next;
			count++;
		}
		if(Next!=null)
			 node.next=reverseKNodes(Next,k);
		root=prev;
		return root;
		
	}

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addFirst(5);
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		list.addMiddle(35, 5);
		list.addMiddle(45, 7);
		list.addMiddle(60, 9);
		//list.removeMiddle(5);
		//list.deleteFirst();
		//list.deleteAtLast();
		//list.root=list.reverseLinkedList(list.root);
		list.root=list.reverseKNodes(list.root,2);
		list.display(list.root);
		
		

	}

}
