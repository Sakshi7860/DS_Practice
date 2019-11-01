package com.practice.HackerRankQue;

public class BinarySearchTree {
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int value)
		{
			left=null;
			right=null;
			data=value;
		}
	}
	Node root;
	
	public Node addNode(Node root, int val)
	{
		Node node=root;
		if(node==null)
		{
			Node node1=new Node(val);
			root=node1;
		}
		else
		{
		if(val<node.data)
		{
			node.left=addNode(node.left, val);
		}
		else if(val>=node.data)
		{
			node.right=addNode(node.right, val);
		}
		}
		
		return root;
	}
	
	public void displayInOrder(Node root)
	{
		Node node=root;
		if(node ==null)
			return;
		displayInOrder(node.left);
		System.out.println(node.data);
		displayInOrder(node.right);
	}
	
	public void preOrder(Node root)
	{
		Node node=root;
		if(node ==null)
			return;
		
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	public void postOrder(Node root)
	{
		Node node=root;
		if(node ==null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
		
	}
	int sum=0;
	public int printSumOfAllNodes(Node root)
	{
		Node node=root;
		if(node==null)
			return 0;
		
		printSumOfAllNodes(node.left);
		sum+=node.data;
		printSumOfAllNodes(node.right);
		return sum;
		
	}
	int sum1=0;
	public int printSumOfLeafNodes(Node root)
	{

		Node node=root;
		if(node==null)
			return 0;
		printSumOfLeafNodes(node.left);
		if(node.left==null && node.right==null)
			sum1+=node.data;
		printSumOfLeafNodes(node.right);
		return sum1;
		
	}
	int sum2=0;
	public int printSumOfNonLeafNodes(Node root)
	{
		Node node=root;
		if(node==null)
			return 0;
		printSumOfNonLeafNodes(node.left);
		if(node.left!=null || node.right!=null)
			sum2+=node.data;
		printSumOfNonLeafNodes(node.right);
		return sum2;
	}
	
	public int findMin(Node root)
	{
		Node node=root;
		while(node.left!=null)
			node=node.left;
		return node.data;
	}
	
	public int findHeight(Node root)
	{
		Node node=root;
		if(node==null)
			return -1;
		int leftHeight=findHeight(node.left);
		int rightHeight=findHeight(node.right);
		return (max(leftHeight,rightHeight)+1);
		
	}
	public int max(int a, int b)
	{
		return a>b?a:b;
	}

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.root=bst.addNode(bst.root, 50);
		bst.root=bst.addNode(bst.root, 40);
		bst.root=bst.addNode(bst.root, 20);
		bst.root=bst.addNode(bst.root, 100);
		bst.root=bst.addNode(bst.root, 60);
		bst.root=bst.addNode(bst.root, 80);
		bst.preOrder(bst.root);
		//System.out.println(bst.printSumOfAllNodes(bst.root));
		System.out.println(bst.printSumOfLeafNodes(bst.root));
		System.out.println(bst.findMin(bst.root));
		System.out.println(bst.printSumOfNonLeafNodes(bst.root));
		System.out.println(bst.findHeight(bst.root));

	}

}
