package com.vineet.Tutort.LinkedList;


// https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleNode {
    public static void main(String[] args) {

        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);

        System.out.println(middleNode(n1));
    }

    public static Node middleNode(Node head) {

        Node fast = head;
        Node slow = head;
        // For First Middle Element
        // --> while (fast != null && fast.next.next != null)
        // For Second Middle Element
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}


