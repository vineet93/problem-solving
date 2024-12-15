package com.vineet.Tutort.LinkedList;

import java.util.HashSet;

public class CircularLinkedList {

    public static void main(String[] args) {
        Node n1= new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next= new Node(4);
        n1.next.next.next.next= new Node(5);
        n1.next.next.next.next.next = n1.next;

        System.out.println(hasCycle(n1));
    }

    public static boolean hasCycle(Node head) {

        if(head == null || head.next == null)
            return false;

        Node temp=head;

        HashSet<Node> hs = new HashSet<Node>();
        while(temp != null) {
            if(hs.contains(temp)) {
                System.out.println("At Ele : "+temp.data);
                return true;
            }else {
                hs.add(temp);
                temp= temp.next;
            }
        }
        return false;
    }
}
