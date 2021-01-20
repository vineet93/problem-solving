package com.vineet.trees;

import java.util.HashSet;

public class PairSumProblem {
	
	private boolean isPairExist;
	

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

public void checkIfPairExist(Node root,int Sum,HashSet<Integer> key) {
	if(root == null) {
		return;
	}
	
	if(key.contains(Sum - root.data)) {
			isPairExist = true;
	} else {
		key.add(root.data);
		checkIfPairExist(root.left,Sum,key);
		checkIfPairExist(root.right,Sum,key);
	}
}

	public static void main(String[] args) {
		
        Node root = null;
        int sum=30;
        HashSet<Integer> hs = new HashSet<>();
		
		PairSumProblem bst = new PairSumProblem();
		root = bst.insert(root, 8);
		bst.insert(root, 5);
		bst.insert(root, 12);
		bst.insert(root, 10);
		bst.insert(root, 18);
		bst.insert(root, 25);
		bst.checkIfPairExist(root, sum, hs);
		System.out.println("Is pair exist "+ bst.isPairExist);
	}
}
