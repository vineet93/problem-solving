package com.vineet.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	
	private Node<T> root;
	private int sizeOfList;

	@Override
	public void insert(T data) {
		
		++this.sizeOfList;
		
		if(root == null) {
			this.root = new Node<>(data);
		}else {
			insertDataAtBeg(data);
		}
		
	}
	
	//O(1)
	private void insertDataAtBeg(T data) {
		Node<T> newNode= new Node<T>(data);	
		newNode.setNextNode(root);
		this.root=newNode;
		
	}
	
	private void insertDataAtEnd(T data, Node<T> node) {
		if(node.getNextNode() == null) {
			insertDataAtEnd(data,node.getNextNode());
		}else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
		
	}

	@Override
	public void remove(T data) {
			if(this.root == null )
				return;
			
			--this.sizeOfList;
			
			if(this.root.getData().compareTo(data) == 0) {
				this.root=this.root.getNextNode();
				
			} else {
				remove(data,root,root.getNextNode());
			}
		
	}

	private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {
		while( actualNode != null) {
			if(actualNode.getData().compareTo(dataToRemove) ==0 ) {
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode= null;
				return;
			}
			
			previousNode = actualNode;
			actualNode=actualNode.getNextNode();
			
		}
		
	}

	@Override
	public void traverseList() {
		
		if(this.root== null)
			return;
		
		Node<T> actuaNode=this.root;
		
		while (actuaNode != null) {
			System.out.print(actuaNode+" ->");
			actuaNode = actuaNode.getNextNode();
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return  this.sizeOfList;
	}
	
	

}
