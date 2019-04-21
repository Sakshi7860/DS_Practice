package DS;

import java.util.LinkedList;
import java.util.Queue;

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
	
	
	public boolean search(Node root, int data)
	{
		Node node=root;
		if(node==null)
			return false;
		if(node.data==data)
			return true;
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
		if(root!=null)
			System.out.println(root.data);
		else
			return;
		display(root.left);
		display(root.right);
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

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.root=tree.insertNode(tree.root,100);
		tree.root=tree.insertNode(tree.root,50);
		tree.root=tree.insertNode(tree.root,200);
		tree.root=tree.insertNode(tree.root,10);
		tree.root=tree.insertNode(tree.root,8);
		tree.root=tree.insertNode(tree.root,15);
		//tree.display(tree.root);
		tree.displayLevelOrder(tree.root);
		System.out.println("Min Value is "+tree.findMin(tree.root));
		if (tree.search(tree.root, 80))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		System.out.println("Height of the tree is "+tree.findHeight(tree.root));
	}

}
