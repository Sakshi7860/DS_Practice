package DS_practice;

public class BinaryTree {
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
	
	public void addNode(int item)
	{
		Node node =new Node(item);
		if(root==null)
		{
			root=node;
		}
		else
		{
			
		}
		
	}
	
	public void inOrder(Node root)
	{
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		     
	}
	public static void main(String[] args) {
		BinaryTree binaryTree= new BinaryTree();
		binaryTree.addNode(10);
		

	}

}
