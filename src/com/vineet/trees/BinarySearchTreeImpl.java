package com.vineet.trees;

public class BinarySearchTreeImpl implements BinarySearchTree {
	

	
	@Override
	public Node insert(Node node,int data) {
		
		if(node == null) {
			return createNewNode(data);
		}
		
		if(data < node.data) {
			node.left= insert(node.left,data);
		}else if(data > node.data) {
			node.right= insert(node.right,data);
		}
	
		return node; 
		
	}



	private Node createNewNode(int data) {
		
		Node node = new Node();
		node.data=data;
		node.left=null;
		node.right=null;
		
		return node;
	}



	@Override
	public void inorder(Node node) {
		
		if(node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data+",");
		inorder(node.right);
	}



	@Override
	public void preorder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data+",");
		preorder(node.left);
		preorder(node.right);
		
	}



	@Override
	public void postorder(Node node) {
		if(node == null) {
			return;
		}
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+",");
	}



	@Override
	public int heightOfTree(Node root) {
		
		if(root == null) {
			return 0;
		}else {
		 int leftDepth = heightOfTree(root.left);
		 int rightDepth = heightOfTree(root.right);
		  
		 if (leftDepth > rightDepth) 
             return (leftDepth + 1); 
          else 
             return (rightDepth + 1);
		}
		
	}



	@Override
	public void levelOrderTraversal(Node node) {
		
		int level = heightOfTree(node);
		for(int i=1;i<=level;i++) {
			printGivenLevel(node,i);
		}
	}



	private void printGivenLevel(Node node, int level) {
		
		if(node == null) {
			return;
		}else if(level == 1){
			System.out.println(node.data);
		}else if(level > 1) {
			printGivenLevel(node.left, level-1);
			printGivenLevel(node.right, level-1);
		}
		
	}
	
private void printGivenLevelSpiral(Node node, int level,String flag) {
		
		if(node == null) {
			return;
		}else if(level == 1){
			System.out.println(node.data);
		}else if(level > 1) {
			if(flag.equalsIgnoreCase("left")) {
				printGivenLevelSpiral(node.left, level-1,flag);
				printGivenLevelSpiral(node.right, level-1,flag);
			}else if(flag.equalsIgnoreCase("right")) {
				printGivenLevelSpiral(node.right, level-1,flag);
				printGivenLevelSpiral(node.left, level-1,flag);
			}
		}
		
	}



	@Override
	public void spiralOderTraversal(Node node) {
		int level = heightOfTree(node);
		String flag;
		for(int i=1;i<=level;i++) {
			if(i % 2 != 0) {
            flag ="right";
			printGivenLevelSpiral(node,i,flag);
			}else {
				flag ="left";
				printGivenLevelSpiral(node,i,flag);
			}
		}
		
	}

}
