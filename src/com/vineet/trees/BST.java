package com.vineet.trees;

public class BST {

	public static void main(String[] args) {
		
		Node root = null;
		
		BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
		root = bst.insert(root, 8);
		bst.insert(root, 12);
		bst.insert(root, 10);
		bst.insert(root, 18);
		bst.insert(root, 5);
		bst.insert(root, 25);
		//bst.inorder(root);
		//bst.preorder(root);
		//bst.postorder(root);
		//int maxDepth = bst.heightOfTree(root);
		//System.out.println("Max Depth of BST is :"+maxDepth);
		//bst.levelOrderTraversal(root);
		bst.spiralOderTraversal(root);

	}

}
