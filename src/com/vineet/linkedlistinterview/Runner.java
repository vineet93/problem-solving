package com.vineet.linkedlistinterview;


public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(3);
		list.insert(6);
		list.insert(4);
		list.insert(8);
		
		
		list.show();
		//Node head = list.getHeadOfinkedList();
//		System.out.println("head is :" + head.data);
		
		
//		Node newHead = list.insertAtPosition(7, 7, head);
//		System.out.println("head is :" + newHead.data);
//		list.deleteAtPosition(8);
//		System.out.println();
		list.reverseLinkedList();
		System.out.println();
		list.show();
		
		//Find Middle Element of linked List.
		

	}

}
