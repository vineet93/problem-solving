package com.vineet.linkedlistinterview;

import java.util.HashSet;

public class LinkedListInterSection {
	
	


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
	
		Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next = new Node(7);
        // list 2
        Node n2 = new Node(10);
        n2.next = new Node(9);
        n2.next.next = new Node(8);
        n2.next.next.next = n1.next.next.next;
        Print(n1);
        Print(n2);
        
        Node intersectingPoint = checkIntersectingPoint(n1,n2);
        System.out.println("intesecting point :"+intersectingPoint.data);
		

	}

	private static Node checkIntersectingPoint(Node n1, Node n2) {
		
		HashSet<Node> hs = new HashSet<Node>();
		while(n1 != null) {
			hs.add(n1);
			n1= n1.next;
		}
		
		while(n2 != null) {
			if(hs.contains(n2)) {
				return n2;
			}
			n2= n2.next;
		}
		
		
		return null;
	}

}


