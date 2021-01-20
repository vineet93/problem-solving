	package com.vineet.linkedlistinterview;

public class LinkedList implements LinkedListOps {
		
	Node head;
	
	// Insert Elements to List.
	public void insert(int data) {
		
		Node node= new Node(data);
		node.data=data;
		node.next=null;
		
		if(head == null) {
			
			head= node;
		} else {
			
			Node n= head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	
	// For Displaying elements in Linked List.
	public void show() {
		
		if(head == null) {
			System.out.println("No elements in  linked list");
		} else {
			
			Node n = head;
			while(n != null) {
				System.out.print(n.data+"-->");
				n=n.next;
			}
		}
	}
	
	// For fetching the Size of Linked List.
	public int size() {
		
		int count=0;
		if(head == null) {
			return count;
		} else {
			
			Node n = head;
			while(n != null) {
				count++;
				n=n.next;
			}
		}
		return count;
		
	}
	
	public Node insertAtPosition(int data,int position,Node oldhead) {
		
		Node n = oldhead;
		
		if(position == 0) {
			Node node = new Node(data);
			node.data=data;
			node.next = head;
			head=node;
			return head;
		}else {
			int count = 0;
		
			while(n != null && count < position-1) {
				count++;
				n=n.next;
			}
			Node tempNode= new Node(data);
			tempNode.data=data;
			tempNode.next=n.next;
			n.next=null;
			n.next=tempNode;
			
		}
		
		return head;
		
	}
	
public Node getHeadOfinkedList() {
		
	    if(head == null) {
		System.out.println("No element present in linked list");
	    } 
	    
		return head;
	    
	   
	}

@Override
public int getMiddleElement() {
	
	return 0;
}

@Override
public void deleteAtPosition(int position) {
	
	if(head == null) {
		System.out.println("No elements in linked list");
	}
	
	Node temp = head;
	
	if(position == 0) {
		head=temp.next;
	}
	
	for(int i=0;temp!= null && i<position-1;i++) {
		temp=temp.next;
	}
	
	if(temp != null) {
		temp.next = temp.next.next;
	}
	
}

@Override
public void reverseLinkedList() {
	
	if(head == null) {
		System.out.println("No element in the linked list.");
	}
	
	Node curr = head;
	Node prev = null;
	Node next = null;

	
	while(curr != null) {
		next = curr.next; // 3, 6
		curr.next=prev; // null, 5
		prev=curr; // 5, 3
		curr=next; // 3, 6
	}
	head=prev;
}
}
