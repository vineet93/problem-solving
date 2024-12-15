package com.vineet.Tutort.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);

        Node temp = n1;
        System.out.println("Before Reverse");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();

        Node ans = reverseList(n1);

        System.out.println("Before Reverse");
        while (ans != null) {
            System.out.print(ans.data + "-->");
            ans = ans.next;
        }
    }

    public static Node reverseList(Node head) {
        Node node = null;

        if(head == null)
            return head;

        if(head.next == null){
            return head;

        }

        Node curr = head;
        Node next = null;
        Node prev = null;

        while(curr != null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        return head;
    }
}
