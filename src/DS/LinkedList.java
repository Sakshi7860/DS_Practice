package DS;

import java.util.ArrayList;
import java.util.List;
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
	
	int detectLoop(Node head) {
        Node p=head;
        Node q=head;
        while(q!=null && q.next!=null)
        {
            p=p.next;
            q=q.next.next;
            if(p==q)
              return 1;
        }
        return 0;
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
	 int getMiddle(Node head)
	   {
	        Node p=head;
	        Node q=head;
	        while(q!=null && q.next!=null)
	        {
	            p=p.next;
	            q=q.next.next;
	        }
	        return p.data;
	        
	        
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
	//Ist method
	int getNthFromLast1(Node head, int n)
    {
    	Node node=head;
    	Node node1=head;
    	int count=0;
    	while(node!=null)
    	{
    	    node=node.next;
    	    count++;
    	}
    	if(n>count)
    	    return -1;
    	int index=count-n;
    	while(index!=0)
    	{
    	    node1=node1.next;
    	    index--;
    	}
    	return node1.data;
    }
	//2nd Method
	int getNthFromLast(Node head, int n)
    {
        Node p=head;
        Node q=head;
        Node node=head;
        int num=1;
        while(node.next!=null)
        {
            node=node.next;
            num++;
        }
        //to check whether the given number is greater than lenght of linked list or not
        if(n>num)
            return -1;
        int count=n-1;
        while(count!=0)
        {
            q=q.next;
            count--;
        }
        while(q.next!=null)
        {
            p=p.next;
            q=q.next;
        }
        return p.data;
    }
	//Merge Two Sorted Linked List
	Node sortedMerge(Node headA, Node headB) {
	     Node node1=headA;
	     Node node2=headB;
	      Node merge=null;
	      Node merge1=null;
	     if(node1==null && node2 ==null)
	        return null;
	     else if(node1==null)
	        return node2;
	     else if(node2==null)
	        return node1;
	     else
	     {
	        if(node1.data<=node2.data)
	         {
	            merge=node1;
	            node1=node1.next;
	         }
	         else
	         {
	            merge=node2;
	            node2=node2.next;
	         }
	         merge1=merge;
	          while(node1!=null && node2!=null)
	          {
	              if(node1.data<=node2.data)
	            {
	                 merge.next=node1;
	                node1=node1.next;
	            }
	            else
	            {
	                merge.next=node2;
	                node2=node2.next;
	            }
	            merge=merge.next;
	          }
	          if(node2!=null)
	          {
	              merge.next=node2;
	          }
	          if(node1!=null)
	             merge.next=node1;
	             
	        
	     }
	     return merge1;
	   } 
	//Ist Method
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
	
	//2nd method
	public static void pairwiseSwap(Node node)
    {
        Node head=node;
        Node p=head;
        while(p!=null && p.next!=null)
        {
            int temp=p.data;
            p.data=p.next.data;
            p.next.data=temp;
            p=p.next.next;
            
        }
       
    }
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addNodeAtFirst(1);
		list.addNewNode(2, 2);
		list.addNewNode(3, 3);
		list.addNewNode(4, 4);
		list.addNewNode(5, 5);
		list.addNewNode(6, 6);
		list.addNodeAtLast(7);
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
		System.out.println("middle is "+list.getMiddle(list.head));
		System.out.println("--------------------");
		//System.out.println(list.isPalindrome(list.head));
		//list.LengthOfList(list.head);
	//	list.swapInPairs(list.head);
		//list.display();
		//list.display();
		//list.reverseList(list.head);
		//list.reverseListByRecursion(list.head);
		//list.display();
		//System.out.println("--------");
		//list.reversedisplay(list.head);
		//list.traverse(list.head);
	}

}
