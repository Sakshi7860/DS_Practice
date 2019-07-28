package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
	Node root;
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int value)
		{
			data=value;
			left=null;
			right=null;
		}
		
	}
	public Node insert1(Node temp, int key) 
    { 
        Queue<Node> q = new LinkedList<Node>(); 
        q.add(temp); 
       
        // Do level order traversal until we find 
        // an empty place.  
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.left == null)
            { 
                temp.left = new Node(key); 
                break; 
            } else
                q.add(temp.left); 
       
            if (temp.right == null) { 
                temp.right = new Node(key); 
                break; 
            } else
                q.add(temp.right); 
        } 
        return temp;
    } 
       
	int sum=0;
	public int sumOfAllNodes(Node root)
	{
		if(root==null)
			return 0;
		
		sumOfAllNodes(root.left);
		sum+=root.data;
		sumOfAllNodes(root.right);
		return sum;
	}
	int sum1=0;
	public int sumOfLeafNodes1(Node root)
	{
		if(root==null)
			return 0;
		
		sumOfLeafNodes1(root.left);
		if(root.left==null && root.right==null)
			sum1+=root.data;
		sumOfLeafNodes1(root.right);
		return sum1;
	}
	
	void printSibling(Node node)
	{
	    if(node==null)
	        return;
	    printSibling(node.left);
	    
	    if((node.left==null && node.right!=null))
	        System.out.print(node.right.data+" ");
	    else if((node.left!=null && node.right==null))
	        System.out.print(node.left.data+" ");
	   printSibling(node.right);
	   
	    
	}
	
	int count=0;
	int element=0;
	public int KthMinElement(Node root,int k)
	{
		if(root==null)
			return 0;
		
		KthMinElement(root.left,k);
		count++;
		if(count==k)
			element=root.data;
		sumOfLeafNodes1(root.right);
		return element;
	}
	
	public Node insertNode(Node root, int data)
	{
		
		if(root==null)
		{
			Node node=new Node(data);
			root=node;
		}
		else
		{
			if(data<=root.data)
			{
				root.left=insertNode(root.left, data);
			}
			else if(data>root.data)
			{     root.right=insertNode(root.right,data);
			}
			
		}
		return root;
	}   
	
	public int findHeight(Node root)
	{
		if(root==null)
			return -1;
		else
		{
			int leftSubtreeHeight=findHeight(root.left);
			int righSubtreeHeight=findHeight(root.right);
			return max(leftSubtreeHeight,righSubtreeHeight)+1;
		}
		
	}
	public int max(int a,int b)
	{
		return a>b?a:b;
	}
	
	
	public Node search(Node root, int data)
	{
		Node node=root;                                                       
		if(node==null)
			return null;
		if(node.data==data)
			return node;
		else if(data<node.data)
		{
			 return search(node.left, data);
		}
		else
			 return search(node.right, data);
		
		
	}
	
	//With Recursion
//	public int findMin(Node root)
//	{
//		if(root==null)
//			return -1;
//		else
//			if(root.left!=null)
//				return findMin(root.left);
//			else
//				return  root.data;
//	}
	
	//With Iteration
	public int findMin(Node root)
	{
		if(root==null)
			return -1;
		else
		{
			while(root.left!=null)
				root=root.left;
		}
		return root.data;
	}
	
	
	
	public void display(Node root)
	{
		if(root==null)
			return;
		else
		{
			display(root.left);
			System.out.println(root.data);
			display(root.right);
		}
	}
	public void displayLevelOrder(Node root)
	{
		Queue<Node> queue=new LinkedList<>();
		if(root==null)
		  return;
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node current=queue.peek(); 
			System.out.println(current.data);
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
			queue.remove();
		}
		
	}
	public int findSuccessor(Node root, int data)
	{
		Node p=search(root, data);
		
		if(p==null)
			return -1;
		if(p.right!=null)
		{
			Node temp=p.right;
			while(temp.left!=null)
				temp=temp.left;
			return temp.data;
		}
		
		if(p.right==null)
		{
			Node successor=null;
			Node s=root;
			while(p!=s)	
			{
			if(p.data<s.data)
			{
				successor=s;
				s=s.left;
				
			}
			else
				s=s.right;
			}
			return successor.data;
		}
		return -1;
		
	}
	public Node inorderSuccessor(Node root,Node k)
    {
      if(root==null)
        return root;
      if(k.right!=null)
      {
          Node temp=k.right;
          while(temp.left!=null)
               temp=temp.left;
          return temp;
      }
      else if(k.right==null)
      {
          Node successor=null;
          while(root!=k)
          {
              if(k.data<root.data)
              {
                   successor=root;
                   root=root.left;
              }
              else
                  root=root.right;
          }
          return successor;
      }
     return null;
    }
	public int findPredecessor(Node root, int data)
	{
		Node node=search(root, data);
		if(node==null)
			return -1;
		if(node.left!=null)
		{
			Node temp=node.left;
			while(temp.right!=null)
				temp=temp.right;
			return temp.data;
		}
		if(node.left==null)
		{
			Node p=root;
			Node predecessor=null;
			while(p!=node)
			{
				if(node.data>p.data)
				{
					predecessor=p;
					p=p.right;
					
				}
				else
					p=p.left;
			}
			return predecessor.data;
		}
		return -1;
	}
	/*public Node delete(Node root,int data)
	{
		if(root==null)
			return null;
		if(data >root.data)
		{
			root.right=delete(root.right, data);
		}
		if(root.right==null && root.left==null)
			return null;
		else if(root.right==null)
		{
			root.left=null;
			return root;
		}
		else if(root.left==null)
		{
			root.right=null;
			return root;
		}
		
		return root;
		
		
	}*/
	public Node delete(Node root,int data)
	{
		if(root==null)
			return null;
		if(data>root.data)
			root.right=delete(root.right,data);
		if(data<root.data)
			root.left=delete(root.left, data); 
		if(root.data==data)
		{
			if(root.left==null && root.right==null)
				return null;
			else if(root.right==null)
			{
				return root.left;
			}
			else if(root.left==null)
				return root.right;
			else 
			{
				Node temp=root.right;
				while(temp.left!=null)
					temp=temp.left;
				root.data=temp.data;
				root.right=delete(root.right,temp.data);
				
			}
		}
		return root;
	}

	 public boolean checkBST(Node root,int min, int max) {
		
		
		 if(root==null)
	           return true;
	       if(root.data<min || root.data>max)
	          return false;
	      
	     return (checkBST(root.left,min,root.data) && checkBST(root.right,root.data,max));
	          
	      }
	 public int sumOfLeafNodes(Node root)
	    {
		int  a=10;
		int b=20;
		int c=  a>b?a:b;
	       if(root==null)
	            return 0;
	       if(root.left==null || root.right==null)
	            return root.data;
	       return (sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right));
	        
	       
	      }
	 static int max=Integer.MAX_VALUE;
     static int node_val=0;
	 public static int maxDiff(Node root, int k)
     {
        if(root==null)
          return 0;
        if(root!=null)
          {
              int max1=root.data>k?(root.data-k):(k-root.data);
              if(max1<max)
                  {
                      max=max1;
                      node_val=root.data;
                  }
          }
          
       maxDiff(root.left,k);
       maxDiff(root.right,k);
       return node_val; 
     }
	 
	      
	public static void main(String[] args) {
		//Queue queue=new LinkedList<>();
		//Stack stack=new Stack();
		//int a=(int)stack.peek();
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		BinarySearchTree tree=new BinarySearchTree();
		
		tree.root=tree.insertNode(tree.root, 10);
		tree.root=tree.insertNode(tree.root, 1);
		tree.root=tree.insertNode(tree.root, 20);
		tree.root=tree.insertNode(tree.root, 15);
		tree.root=tree.insertNode(tree.root, 18);
		//tree.display(tree.root);
		//tree.printSibling(tree.root);
//		tree.display(tree.root);
//		tree.root=tree.insertNode(tree.root,10);
//		tree.root=tree.insertNode(tree.root,7);
//		tree.root=tree.insertNode(tree.root,9);
//		tree.root=tree.insertNode(tree.root,14);
//		tree.root=tree.insertNode(tree.root,6);
//		tree.root=tree.insertNode(tree.root,18);
//		tree.root=tree.insertNode(tree.root,11);
//		tree.root=tree.insertNode(tree.root,4);
//		tree.root=tree.insertNode(tree.root,100);
//		tree.root=tree.insertNode(tree.root,50);
//		tree.root=tree.insertNode(tree.root,200);
//		tree.root=tree.insertNode(tree.root,10);
//		tree.root=tree.insertNode(tree.root,8);
//		tree.root=tree.insertNode(tree.root,15);
//		tree.root=tree.insertNode(tree.root,60);
//		tree.root=tree.insertNode(tree.root,55);
//		tree.root=tree.insertNode(tree.root,70);
//		tree.root=tree.insertNode(tree.root,53);
//		tree.root=tree.insertNode(tree.root,300);
		//tree.display(tree.root);
		//tree.delete(tree.root, 34);
		//Node node=tree.search(tree.root, 34);
		//System.out.println(tree.inorderSuccessor(tree.root,node).data);
		System.out.println(tree.sumOfLeafNodes1(tree.root));
		//System.out.println(tree.KthMinElement(tree.root,3));
		//System.out.println(maxDiff(tree.root, 13));
	//	tree.displayLevelOrder(tree.root);
		//System.out.println("Min Value is "+tree.findMin(tree.root));
//		if (tree.search(tree.root, 80))
//			System.out.println("Found");
//		else
//			System.out.println("Not Found");
//		System.out.println("Height of the tree is "+tree.findHeight(tree.root));
		//System.out.println(tree.findSuccessor(tree.root, 8));
		//System.out.println(tree.findPredecessor(tree.root,300));
		//tree.delete(tree.root,300);
		//System.out.println(tree.checkBST(tree.root,min,max));
		//tree.display(tree.root);
		//tree.sumOfLeafNodes(tree.root);
		//tree.display(tree.root);
	}

}
