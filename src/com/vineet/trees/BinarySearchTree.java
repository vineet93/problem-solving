package com.vineet.trees;

public interface BinarySearchTree {
	
	
	public Node insert(Node node,int data);
	public void inorder(Node node);
	public void preorder(Node node);
	public void postorder(Node node);
	public int heightOfTree(Node node);
	public void levelOrderTraversal(Node node);
	public void spiralOderTraversal(Node node);
	
	

}
