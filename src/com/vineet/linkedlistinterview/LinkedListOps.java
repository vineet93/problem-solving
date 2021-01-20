package com.vineet.linkedlistinterview;

public interface LinkedListOps {

	public void insert(int data);
	public Node insertAtPosition(int data,int position,Node oldhead);
	public void show();
	public int size();
	public Node getHeadOfinkedList();
	public int getMiddleElement();
	public void deleteAtPosition(int position);
	public void reverseLinkedList();
}
