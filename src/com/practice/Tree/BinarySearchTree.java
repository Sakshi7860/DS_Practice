package com.practice.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int val)
		{
			this.data=val;
			this.left=null;
			this.right=null;
		}
	}
	public Node addNode(Node root,int data)
	{
		if(root==null)
		{
			Node node=new Node(data);
			root=node;
		}
		else if(data<=root.data) {
			root.left=addNode(root.left, data);
		}
		else if(data>root.data)
		{
			root.right=addNode(root.right, data);
		}
		return root;
	}
	public void InOrder(Node root) 
	{
		if(root==null)
			return;
		InOrder(root.left);
		System.out.println(root.data);
		InOrder(root.right);
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
	public int height(Node root)
	{
		if(root ==null)
			return 0;
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		return max(leftHeight,rightHeight)+1;
	}
	
	public static int max(int a, int b)
	{
		return a>b?a:b;
	}
	
	public int findDiameter(Node root) // if daimeter passes through root
	{
		if(root==null)
			return 0;
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		int d1=findDiameter(root.left);
		int d2=findDiameter(root.right);
		return max(leftHeight+rightHeight+1,max(d1,d2));
		
	}
	int count=0;
	public int countLeaves(Node root)
	{
		Node node=root;
		if(node==null)
            return 0;
         if(node.left==null && node.right==null)
            {
                count++;
            }
        countLeaves(node.left);
        countLeaves(node.right);
        return count;
	}
	
	public void levelOrderTraversal(Node root)
	{
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node n=queue.peek();
			if(n.left!=null)
				queue.add(n.left);
			if(n.right!=null)
				queue.add(n.right);
			System.out.print("Level oder traversal"+queue.poll().data);
		}
		
	}
	
	
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.root=tree.addNode(tree.root,10);
//		tree.root=tree.addNode(tree.root, 20);
		tree.addNode(tree.root,50);
		tree.addNode(tree.root,5);
		tree.addNode(tree.root,100);
		tree.addNode(tree.root,2);
		tree.addNode(tree.root,60);
		tree.addNode(tree.root,9);
		tree.InOrder(tree.root);
//		tree.preOrder(tree.root);
//		tree.postOrder(tree.root);
		System.out.println(tree.height(tree.root));
		System.out.println(tree.findDiameter(tree.root));
		System.out.println(tree.countLeaves(tree.root));
		tree.levelOrderTraversal(tree.root);
		
		

	}

}
