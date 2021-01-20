package com.vineet.linkedlistinterview;

/**
 * 
 * @author vineetkhare
 * 
 * Understanding: In a recursive call the state of the variables are retained along with the function call in the stack.
 * for ex :- in here when merge function is called  with diff start references of the linked list over the stack frames the same values are then 
 * used while resolving the method invocation in the stack. to Understand this try debugging this program and see how n1.next gets evaluated
 * over the method invocations.
 *
 */

public class MergeSortList {
	
	public static void Print(Node n)
	{
	    Node cur = n;
	    while (cur != null) {
	        System.out.print(cur.data + "  ");
	        cur = cur.next;
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		
		Node n1= new Node(1);
		n1.next= new Node(4);
		n1.next.next = new Node(7);
		
		Node n2= new Node(2);
		n2.next= new Node(3);
		n2.next.next= new Node(9);
		
		Node sortedHead = mergeSortedList(n1,n2);
		Print(sortedHead);
	}

	private static Node mergeSortedList(Node n1, Node n2) {
		
		 if(n1 == null) {
			 System.out.println("return n2 "+n2.data);
			 return n2;
		 }
		 
		 if(n2== null) {
			 System.out.println("return n1 "+n1.data);
			 return n1;
		 }
		 
		 if(n1.data<n2.data) {
			 System.out.println("n1.next = mergeSortedList("+n1.next + "," + n2+")");
			n1.next= mergeSortedList(n1.next, n2);
			return n1;
		 }else {
			 System.out.println("n2.next = mergeSortedList("+n1 + "," + n2.next+")");
			 n2.next = mergeSortedList(n1, n2.next);
			 return n2;
		 }
	}

}
