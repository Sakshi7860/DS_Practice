package com.practice.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

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
			System.out.println("Level oder traversal : "+queue.poll().data);
		}
		
	}
	static Map<Integer,java.util.List<Integer>> map=new TreeMap<>();
	List<Integer> list=new ArrayList<>();
	public void verticalOrderTraversal(Node root,int hd)
	{
		if(root==null)
			return;
		
		
		if(!map.containsKey(hd))
			{
			List<Integer> list=new ArrayList<>();
			list.add(root.data);
			map.put(hd,list);
			
		}
		else
		{
			List<Integer> list2=map.get(hd);
			list2.add(root.data);
			map.put(hd,list2);
		}
		verticalOrderTraversal(root.left,hd-1);
		verticalOrderTraversal(root.right,hd+1);
		
	}
	
	public void printBottomView()
	{
		verticalOrderTraversal(root, 0);
		Set<Integer> set=map.keySet();
		System.out.println(map);
		for(int i:set)
		{
			List<Integer> list=map.get(i);
			System.out.println(list.get(list.size()-1));
		}
	}
	
	int maxLevel=0;
	public void leftView(Node root, int level)
	{
		if(root==null)
			return;
		if(level>maxLevel)
			{
				System.out.println(root.data);
				maxLevel=level;
			}
		leftView(root.left, level+1);
		leftView(root.right, level+1);
		
	}
	
	public void rightView(Node root,int level)
	{
		if(root==null)
			return;
		if(level>maxLevel)
			{
				System.out.println(root.data);
				maxLevel=level;
			}
		rightView(root.right, level+1);
		rightView(root.left, level+1);
		
	}
	
	public void levelOrderSpiral(Node root)  //method 1 using queue and stack
	{
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		queue.add(null);
		 int count=0;
		while(!queue.isEmpty())
		{
			Node n=queue.peek();
			if(n==null)
			{
				queue.add(null);
				queue.poll();
				count++;
				if(count%2==0)
				{
					Stack<Node> stack=new Stack<>();
					while(queue.peek()!=null)
					{
						Node node1=queue.peek();
						if(node1.left!=null)
						{
							queue.add(node1.left);
						}
						if(node1.right!=null)
						{
							queue.add(node1.right);
						}
						stack.push(queue.poll());
					}
					while(!stack.isEmpty())
						System.out.println(stack.pop().data);
				}
			}
			else 
			{
				if(n.left!=null)
				{
					queue.add(n.left);
				}
				if(n.right!=null)
				{
					queue.add(n.right);
				}
				System.out.println(queue.poll().data);
			}
			
		}
		
	}
	
	public void printSpiralForm(Node root) //2nd Method using 2 stacks
	{
		Stack<Node> stack1=new Stack<>();
		Stack<Node> stack2=new Stack<>();
		stack1.push(root);
		while(!stack1.isEmpty() || !stack2.isEmpty())
		{
		while(!stack1.isEmpty())
		{
			Node p=stack1.pop();
			System.out.println(p.data);
			if(p.right!=null)
				stack2.push(p.right);
			if(p.left!=null)
				stack2.push(p.left);
			
		}
		while(!stack2.isEmpty())
		{
			Node p1=stack2.pop();
			System.out.println(p1.data);
			if(p1.left!=null)
				stack1.push(p1.left);
			if(p1.right!=null)
				stack1.push(p1.right);
			
		}
		}
		
		
	}
	public Node findNode(Node root, int data)
	{
		if(root.data==data)
			return root;
		else if(data>root.data)
			return findNode(root.right, data);
		else
			return findNode(root.left, data);
	}
	
	public int lowestCommonAncestor(Node root, int data1, int data2)
	{
		Node node1=findNode(root, data1);
		Node node2=findNode(root, data2);
		if(node1==null || node2==null)
			return -1;
		if(node1.data==root.data || node2.data==root.data)
		{
			return root.data;
		}
		else if(node1.data<root.data && node2.data>root.data)
		{
			return root.data;
		}
		else if(node1.data<root.data && node2.data<root.data)
		{
			return lowestCommonAncestor(root.left, node1.data, node2.data);
			
		}
		else 
		{
			return lowestCommonAncestor(root.right, node1.data, node2.data);
			
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
		tree.addNode(tree.root,40);
		tree.addNode(tree.root,1);
		//tree.InOrder(tree.root);
//		tree.preOrder(tree.root);
//		tree.postOrder(tree.root); 
		//System.out.println(tree.height(tree.root));
		//System.out.println(tree.findDiameter(tree.root));
		//System.out.println(tree.countLeaves(tree.root));
		//tree.levelOrderInSpiralForm(tree.root);
		//tree.leftView(tree.root, 1);
		//tree.rightView(tree.root,1);
		//tree.levelOrderSpiral(tree.root);
		//tree.printSpiralForm(tree.root);
		//System.out.println(tree.lowestCommonAncestor(tree.root,40,60 ));
		System.out.println(tree.findNode(tree.root, 60));
		
		

	}

}
