package DS;

import DS.BinarySearchTree.Node;

public class DemoClass {
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
		
		public int sumOfLeafNodes(Node root)
	    {
	       if(root==null)
	            return 0;
	       if(root.left==null && root.right==null)
	    	   return root.data;
	       else
	    	   return (sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right));
       
	        
	       
	      }

	public static void main(String[] args) {
		DemoClass dm=new DemoClass();
		dm.root=dm.insertNode(dm.root,67);
		dm.root=dm.insertNode(dm.root,34);
		dm.root=dm.insertNode(dm.root,82);
		dm.root=dm.insertNode(dm.root,12);
		dm.root=dm.insertNode(dm.root,45);
		System.out.println(dm.sumOfLeafNodes(dm.root));
		

	}

}
