package com.vineet.linkedlistinterview;

import java.util.HashSet;

public class LinkedListCycle {
	
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
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next= new Node(4);
		n1.next.next.next.next= new Node(5);
		n1.next.next.next.next.next = new Node(6);
  
		System.out.println(isCycleExist(n1));

	}

	private static boolean isCycleExist(Node n1) {
		
		HashSet<Node> hs = new HashSet<Node>();
		while(n1 != null) {
			if(hs.contains(n1)) {
				return true;
			}else {
				hs.add(n1);
				n1= n1.next;
			}
		}
		return false;
	}

}
