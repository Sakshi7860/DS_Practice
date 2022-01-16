package DS_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

import DS.DoublyLinkedList;

public class BinarySearchTree {
	Node root;
	
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	public Node insert(Node root,int data)
	{
		if(root==null)
			root=new Node(data);
		else if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else
			root.right=insert(root.right,data);
		return root;
	}
	
	public void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	public void preOrder(Node root)
	{
		if(root==null)
			return;
		
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(Node root)
	{
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
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
	
	int sumOfLeafNode=0;
	public int sumOfLeafNodes(Node root)
	{
		if(root==null)
			return 0;
		sumOfLeafNodes(root.left);
		if(root.left==null && root.right==null)
			sumOfLeafNode+=root.data;
		sumOfLeafNodes(root.right);
		return sumOfLeafNode;
		
	}
	
	public int findMin(Node root)
	{
		Node temp=root;
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		return temp.data;
		
	}
	
	public int findMax(Node root)
	{
		Node temp=root;
		if(temp==null)
			return -1;
		while(temp.right!=null)
		{
			temp=temp.right;
		}
		return temp.data;
		
	}
	
	public static int max(int a,int b)
	{
		return a>b?a:b;
	}
	
	public int findHeight(Node root)
	{
		if(root==null)
			return -1;
		int leftSubtree=findHeight(root.left);
		int rightSubtreet=findHeight(root.right);
		return max(leftSubtree,rightSubtreet)+1;
		
	}
	
	public Node search(Node root,int data)
	{
		
		if(root==null) 
			return null;
		if(root.data==data)
			return root;
		
		if(data<root.data)
			return search(root.left, data);
		else
			return search(root.right, data);
	}
	
	public void displayLevelOrder(Node root)
	{
		java.util.Queue<Node> queue=new LinkedList<>();
		if(root==null)
			return;
		else
			queue.add(root);
		while(!queue.isEmpty())
		{
			Node current=queue.peek();
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
			System.out.println(current.data);
			queue.remove();
			
		}
		
		
	}
	public Node inorderSuccessor(Node root,int data)
	{
		Node temp=search(root, data);
		if (temp==null)
			return null;
		else
		{
			if(temp.right!=null)
			{
				Node node=temp.right;
				while(node.left!=null)
					node=node.left;
				return node;
			}
			else
			{
				Node successor=null;
				Node ancestor=root;
				while(temp!=ancestor)
				{
					if(data<ancestor.data)
					{
						successor=ancestor;
						ancestor=ancestor.left;
					}
					else
					{
						ancestor=ancestor.right;
					}
				}
				return successor;
			}
		}
		
	}
	
	public Node findPredecessor(Node root, int data)
	{
		Node temp=search(root, data);
		if(temp==null)
			return null;
		else
		{
			if(temp.left!=null)
			{
				Node node=temp.left;
				while(node.right!=null)
				{
					node=node.right;
				}
				return node;
			}
			else
			{
				Node predecessor=null;
				Node p=root;
				while(p!=temp)
				{
					if(temp.data<p.data)
						p=p.left;
					else
					{
						predecessor=p;
						p=p.right;
					}
					
				}
				return predecessor;
			}
		}
	}
	
	public void leftView(Node root)
	{
		Node temp=root;
		Queue<Node> queue=new LinkedList<>();
		queue.add(temp);
		while(!queue.isEmpty())
		{
			int len=queue.size();
			for(int i=0;i<len;i++)
			{
				Node node=queue.peek();
				if(i==0)
				{
					System.out.println(queue.peek().data);
				}
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
					queue.add(node.right);
				queue.poll();
			}
		}
		
		
	}
	
	public void rightView(Node root)
	{
		Node temp=root;
		Queue<Node> queue=new LinkedList<>();
		queue.add(temp);
		while(!queue.isEmpty())
		{
			int len=queue.size();
			for(int i=0;i<len;i++)
			{
				Node node=queue.peek();
				if(i==len-1)
				{
					System.out.println(queue.peek().data);
				}
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
					queue.add(node.right);
				queue.poll();
			}
		}
		
		
	}
	
	Map<Integer,List<Integer>> map = new TreeMap<>();
	List<Integer> list = new ArrayList<>();
	public void verticalOrderTraversal(Node root, int hd)
	{
		if(root==null)
			return;
		if(!map.containsKey(hd))
		{
			List<Integer> list1= new ArrayList<>();
			list1.add(root.data);
			map.put(hd, list1);
		}
		else
		{
			List<Integer> list1=map.get(hd);
			list1.add(root.data);
			map.put(hd, list1);
		}
		
		verticalOrderTraversal(root.left, hd-1);
		verticalOrderTraversal(root.right, hd+1);
		
	}
	
	public void verticalOrder(Node root)
	{
		verticalOrderTraversal(root, 0);
		Set<Integer> set=map.keySet();
		for(int i:set)
		{
			List<Integer> list=map.get(i);
			for(int j:list)
				System.out.print(j+" ");
			System.out.print("\n");
		}
	}
	
	public void topView(Node root)
	{
		verticalOrderTraversal(root, 0);
		Set<Integer> set=map.keySet();
		for(int i:set)
		{
			List<Integer> list=map.get(i);
			System.out.println(list.get(0));
		}
		
		
	}
	
	public void bottomView(Node root)
	{
		verticalOrderTraversal(root, 0);
		Set<Integer> set=map.keySet();
		for(int i:set)
		{
			List<Integer> list=map.get(i);
			System.out.println(list.get(list.size()-1));
		}
		
		
	}
	
	public int getSize(Node root)
	{
		if(root==null)
			return 0;
		return getSize(root.left)+getSize(root.right)+1;
	}
	
	public void printZigZag(Node root)
	{
		Queue<Node> queue=new LinkedList<>();
		if(root==null)
			return;
		queue.add(root);
		int count=0;
		while(!queue.isEmpty())
		{
			int len=queue.size();
			
			for(int i=0;i<len;i++)
			{
				Node temp=queue.peek();
				if(count%2==0)
				{
					if(temp.right!=null)
						queue.add(temp.right);
					if(temp.left!=null)
						queue.add(temp.left);
				}
				else
				{
					if(temp.left!=null)
						queue.add(temp.left);
					if(temp.right!=null)
						queue.add(temp.right);
					
				}
			System.out.println(temp.data);
			queue.poll();
			}
			count++;
			
			
		}
		
		
	}
	
	int f=1;
	public int balancedTree(Node node)
	{
		if(node==null)
			return 0;
		int left=balancedTree(node.left);
		int right= balancedTree(node.right);
		if(Math.abs(left-right)>1)
		{
			 f=0;
		}
		
		return max(left,right)+1;
	}
	
	public boolean balanced(Node node)
	{
		balancedTree(node);
		if(f==0)
			return false;
		else 
			return true;
	}
	
	public ArrayList<Integer> diagonalTraversal(Node node)
	{
		Queue<Node> queue =new LinkedList<>();
		ArrayList<Integer> list =new ArrayList<>();
		Node temp=node;
		queue.add(temp);
		while(!queue.isEmpty())
		{
			Node current=queue.poll();
			while(current!=null)
			{
				if(current.left!=null)
					queue.add(current.left);
				list.add(current.data);
				current=current.right;
				
				
			}
			
		}
		
		return list;
		
		
	}
	
	 ArrayList<Integer> list1 = new ArrayList<>(); 
	    void  leafNodes(Node root)
	    {
	    	if(root==null)
	    		return;
	      if(root.left==null && root.right==null)
	      {
	            list1.add(root.data);
	      }
	      leafNodes(root.left);
	      leafNodes(root.right);
	            
	    }
	
	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> list = new ArrayList<>();
	    Node node=root;
	    list.add(node.data);
	    Node temp1=null;
	    Node temp2=null;
	    if(node.left!=null)
	       temp1=node.left;
	    if(node.right!=null)
	       temp2=node.right;
	    while(temp1.left!=null)
	    {
	        list.add(temp1.data);
	        temp1=temp1.left;
	        
	    }
	    leafNodes(node);
	    list.addAll(list1);
	    while(temp2.right!=null)
	    {
	        list.add(temp2.data);
	        temp2=temp2.right;
	        
	    }
	    
	    return list;
	    
	        
	    
	}
	
	int lev=-1;
	boolean res=false;
	public void level(Node root,int level)
	{
		if(root==null)
			return;
		level(root.left,level+1);
		if(root.left==null && root.right==null)
		{
			if(lev==-1)
				lev=level;
			else if(lev!=level)
				res=false;
				
		}
		level(root.right,level+1);
	}
	
	public boolean check(Node root)
	{
		level(root,0);
		return res;
	}
	

	public Node bToDll(Node root) {
		java.util.Stack<Node> stack=new java.util.Stack();
		Node head=null;
		   stack.push(root);
		   while(root.left!=null)
		   {
		       stack.push(root.left);
		       root=root.left;
		   }
		   while(!stack.isEmpty())
		   {
		       Node node=stack.pop();
		       if(node.right!=null)
		       {
		           Node p=node.right;
		           stack.push(p);
		           while(p.left!=null)
		                stack.push(p.left);
	              
		       }
		       if(head==null)
		       {
		            
		            node.left=null;
		            node.right=null;
		            head=node;
		       }
		       else
	           {
	               Node temp=head;
	               while(temp.right!=null)
	               {
	                   temp=temp.right;
	               }
	               temp.right=node;
	               node.left=temp;
	               node.right=null;
	           }
		      
		       
		   }
		   return head;
		   
	}
	
	boolean flag=true;
	int treeTraversal(Node root)
	{
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return root.data;
		int leftSum=treeTraversal(root.left);
		int rightSum=treeTraversal(root.right);
		if(root.data!=leftSum+rightSum)
			flag=false;
		return leftSum+rightSum+root.data;
			
	}
	
	void isSumTree(Node root)
	{
		treeTraversal(root);
		if(flag)
			System.out.println("sum tree");
		else
			System.out.println("not sum tree");
		
	}
	
	ArrayList<Integer> inOrderIterative(Node root)
    {
		 java.util.Stack<Node> stack =new java.util.Stack<>();
		 ArrayList<Integer> list =new ArrayList<>();
        Node current=root;
        stack.push(current);
       
        while(true)
        {
            if(current.left!=null)
            {
                stack.push(current.left);
                current=current.left;
            }
            else
            {
                if(!stack.isEmpty())
                {
                    current=stack.peek();
                    System.out.println(current.data);
                    list.add(current.data);
                    stack.pop();
                    if(current.right!=null)
                        stack.push(current.right);
                }
                else
                    break;
            }
            
        }
        return list;
    }
	
	
	
	public static void main(String[] args) {
		
		BinarySearchTree tree= new BinarySearchTree();
		tree.root=tree.insert(tree.root,50);
		tree.root=tree.insert(tree.root,25);
		tree.root=tree.insert(tree.root,20);
		tree.root=tree.insert(tree.root,10);
		tree.root=tree.insert(tree.root,40);
		tree.root=tree.insert(tree.root,60);
		tree.root=tree.insert(tree.root,55);
		tree.root=tree.insert(tree.root,80);
//		tree.root=tree.insert(tree.root,5);
//		tree.inOrder(tre		e.root);
		/*
		 * System.out.println(tree.sumOfAllNodes(tree.root));
		 * System.out.println(tree.sumOfLeafNodes(tree.root));
		 */
//		System.out.println(tree.findMin(tree.root));
//		System.out.println(tree.findMax(tree.root));
//		System.out.println(tree.findHeight(tree.root));
//		System.out.println(tree.search(tree.root, 15));
//		tree.displayLevelOrder(tree.root);
//		System.out.println(tree.inorderSuccessor(tree.root, 22).data);
//		System.out.println(tree.findPredecessor(tree.root,22).data);
//		tree.displayLevelOrder(tree.root);
//		tree.leftView(tree.root);
//		tree.rightView(tree.root);
//		tree.topView(tree.root);
//		tree.verticalOrder(tree.root);
//		tree.bottomView(tree.root);
//		System.out.println(tree.getSize(tree.root));
//		tree.printZigZag(tree.root);
//		System.out.println(tree.balanced(tree.root));
//		System.out.println(tree.boundary(tree.root));
		/*
		 * tree.root=tree.bToDll(tree.root); Node current=tree.root;
		 * while(current!=null) { System.out.println(current.data);
		 * current=current.right; }
		 */
		
//		tree.isSumTree(tree.root);
		System.out.println(tree.inOrderIterative(tree.root));
		
		
			
		

	}

}
