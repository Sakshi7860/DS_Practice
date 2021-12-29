package DS_practice;


public class LinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void addNode(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			
		}
		else
		{
			Node node=head;
			while(node.next!=null)
			{
				node=node.next;
			}
			node.next=n;
		}
		
	}
	
	public void addAtFirst(int data)
	{
		Node node =new Node(data);
		node.next=head;
		head=node;
		
		
	}
	
	public void deleteAtfirst()
	{
	
		head=head.next;
	}
	
	public void deleteAtLast()
	{
		Node n = head;
		while(n.next.next!=null)
		{
			n=n.next;
		}
		n.next=null;
	}
	
	public void addNodeAtPosition(int data, int position)
	{
		Node n =head;
		int count=1;
		while(count!=position-1)
		{
			n=n.next;
			count++;
		}
		Node node =new Node(data);
		node.next=n.next;
		n.next=node;
		
		
	}

	public void deleteAtposition(int position)
	{
		Node n=head;
		int count=1;
		while(count!=position-1)
		{
			n=n.next;
			count++;
		}
		n.next=n.next.next;
		
	}
	public void printList()
	{
		Node n =head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public void reverseListByRecursion(Node p)
	{
		
		if(p.next==null)
		{
			head=p;
			return;
		}
		reverseListByRecursion(p.next);
		/*
		 * Node q=p.next; q.next=p
		 */;
		 
		 p.next.next=p;
		 p.next=null;
		
	}
	
	public void reverseList()
	{
		Node prev=null;
		Node current=head;
		Node nxt=null;
		while(current!=null)
		{
			nxt=current.next;
			current.next=prev;
			prev=current;
			current=nxt;
			
			
			
		}
		this.head=prev;
		
		
	}
	
	public void detectLoop(Node head)
	{
		boolean flag =false;
		Node p=head;
		Node q= head;
		while(p!=q && q.next!=null)
		{
			p=p.next;
			q=q.next.next;
			if(p==q)
			{
				flag=true;
				return;
			}
			
		}
		if(flag)
		{
			System.out.println("loop found");
		}
		else
		{
			System.out.println("loop no found");
		}
		
	}
	
	public void traverse(Node n)
	{ 
		if(n==null)
			return;
		System.out.println(n.data);
		traverse(n.next);
	}
	
	public void reverseTraverse(Node n) {
		if(n==null)
			return;
		reverseTraverse(n.next);
		System.out.println(n.data);
	}
	
	//Make linked list circular and then break the links
	
	public Node rotate(Node head, int k) {
        Node temp=head;
        Node root=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=root;
        Node end=null;
        while(k!=0)
        {
            end=root;
            root=root.next;
            k--;
        }
        end.next=null;
        return root;
        
    }
	
	//It will fail if k<count
	
	public void rotateList(Node head, int k)
	{
		
		
		  Node q=head; 
		  Node n =head;
		  int count =1;
		  while(count<k)
		  { 
			  n=n.next; 
			  count++;
		  }
		  
		 Node p=n.next;
		 Node temp=p;
		 n.next=null;
		 while(p.next!=null) 
		 { 
			 p=p.next;
		 }
		  p.next=q; 
		  this.head=temp;
		 
		
	}
	public void getNthFromLast(Node head, int k)
	{
		Node n =head;
		Node p=head;
		Node q =head;
		while(k!=0)
		{
			q=q.next;
			k--;
		}
		while(q!=null && q.next!=null)
		{
			p=p.next;
			q=q.next;
		}
		
		System.out.println(p.next.data);
		
		
		
		
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(10);
		list.addNode(20);
		//list.addAtFirst(30);
		list.addNode(40);
		list.addNode(50);
//		list.deleteAtfirst();
//		list.deleteAtLast();
//		list.addNodeAtPosition(25,3);
//		list.deleteAtposition(3);
//		list.reverseList();
//		list.printList();
//		list.traverse(list.head);
//		list.reverseTraverse(list.head);
//		list.rotateList(list.head, 2);
//		list.reverseListByRecursion(list.head);
//		list.rotateList(list.head, 4);
//		list.head=list.rotate(list.head, 1);
		list.getNthFromLast(list.head, 1);
//		list.printList();
		
	
	}

}
