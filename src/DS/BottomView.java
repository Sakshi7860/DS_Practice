package DS;

import java.util.*;
import java.util.LinkedList;

class BottomView
{
	Node root;
	class Node {
		int data;
		int hd;
		Node left;
		Node right;
		Node(int val)
		{
			data=val;
			hd=Integer.MIN_VALUE;
			left=null;
			right=null;
		}
		
	}
	
	public void addNode(int val)
	{
		Node node=new Node(val);
		if(root==null)
			root=node;
		else
		{
			Queue<Node> queue=new LinkedList<BottomView.Node>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				Node node1=queue.remove();
				if(node1.left==null)
				{
					node1.left=node;
					break;
				}
				else
					queue.add(node1.left);
				if(node1.right==null)
				{
					node1.right=node;
					break;
				}
				else
					queue.add(node1.right);
			}
			
		}
				
	}
	public void display(Node root)
	{
		if(root==null)
			return;
		System.out.println(root.data);
		display(root.left);
		display(root.right);
	}
	
	public void bottomView(Node root)
    {
		Node node1=root;
        if(node1==null)
            return;
        else
        {
       Queue<Node> queue=new LinkedList<>();
       node1.hd=0;
       queue.add(node1);
       System.out.println("queue is "+queue.size());
       Map<Integer,Integer> map=new TreeMap<>();
       while(!queue.isEmpty())
       {
           Node node=queue.remove();
           //System.out.println(node.data);
           int hd=node.hd;
          //System.out.println(hd);
           map.put(hd,node.data);
           System.out.println(map);
           if(node.left!=null)
           {
               node.left.hd=hd-1;
               queue.add(node.left);
               
           }
           if(node.right!=null)
           {
               node.right.hd=hd+1;
               queue.add(node.right);
               
           }
           
           
           
           
       }
        for (Integer key : map.keySet()) 
        {
             Integer value = map.get(key);
                System.out.print(value+" ");
     

    }
        }
    }
	
	public void topView(Node root)
	{
		Node node1=root;
		Queue<Node> queue=new LinkedList<>();
		Map<Integer,Integer> map=new TreeMap<>();
		node1.hd=0;
		queue.add(node1);
		while(!queue.isEmpty())
		{
			Node node=queue.remove();
			int hd=node.hd;
			if(map.get(hd)==null)
			{
				map.put(hd,node.data);
			}
			System.out.println(map);
			if(node.left!=null)
	           {
	               node.left.hd=hd-1;
	               queue.add(node.left);
	               
	           }
	        if(node.right!=null)
	          {
	               node.right.hd=hd+1;
	               queue.add(node.right);
	               
	         }
		}
		for (Integer key : map.keySet()) 
        {
             Integer value = map.get(key);
                System.out.print(value+" ");
     

    }
		
		
	}

	boolean isIdentical(Node root1, Node root2)
    {
        String s1="";
        String s2="";
        Queue<Node> queue=new LinkedList<>();
        Queue<Node> queue1=new LinkedList<>();
        queue.add(root1);
        queue1.add(root2);
        while(!queue.isEmpty() &&!queue1.isEmpty() )
        {
            Node node=queue.poll();
             Node node1=queue1.poll();
            s1+=node.data;
            s2+=node1.data;
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
             if(node1.left!=null)
                queue1.add(node1.left);
            if(node1.right!=null)
                queue1.add(node1.right);
        }
        if(queue1.size()>0 || queue.size()>0)
            return false;
  
        if(s1.equals(s2))
            return true;
        else 
            return false;
        
    }
	
	void leftView(Node root)
    {
      // Your code here
      Queue<Node> queue=new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty())
      {
          int n=queue.size();
          for(int i=1;i<=n;i++)
          {
              if(i==1)
              {
                  System.out.print(queue.peek().data+" ");
              }
             Node node=queue.poll();
             if(node.left!=null)
                queue.add(node.left);
             if(node.right!=null)
                queue.add(node.right);
          }
          
      }
    }

	void rightView(Node root)
    {
      // Your code here
      Queue<Node> queue=new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty())
      {
          int n=queue.size();
          for(int i=1;i<=n;i++)
          {
              if(i==n)
              {
                  System.out.print(queue.peek().data+" ");
              }
             Node node=queue.poll();
             if(node.left!=null)
                queue.add(node.left);
             if(node.right!=null)
                queue.add(node.right);
          }
          
      }
    }
	
  
              
            
          
          
      
    
	
	
	
	public static void main(String[] args) {
		BottomView view=new BottomView();
		view.addNode(10);
		view.addNode(20);
		view.addNode(30);
		view.addNode(40);
		view.addNode(60);
		view.addNode(70);
		view.addNode(90);
		view.addNode(60);
		view.addNode(70);
		view.addNode(90);
		//view.display(view.root);
		//view.bottomView(view.root);
		//view.topView(view.root);
		view.leftView(view.root);
		view.rightView(view.root);
		
	}
}