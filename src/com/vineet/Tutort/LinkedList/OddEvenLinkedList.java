package com.vineet.Tutort.LinkedList;

public class OddEvenLinkedList {

    public static void main(String[] args) {

        Node n1= new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next= new Node(4);
        n1.next.next.next.next= new Node(5);
        n1.next.next.next.next.next= new Node(6);

        Node ans = oddEvenList(n1);

        while(ans != null){
            System.out.print(ans.data+"-->");
            ans = ans.next;
        }
    }

    public static Node oddEvenList(Node head) {

        if(head == null)
            return null;

        Node odd = head;
        Node even = head.next;
        Node evenhead = even;

        while(even != null && even.next != null){

            odd.next = odd.next.next;
            even.next=even.next.next;
            odd= odd.next;
            even= even.next;
        }
        odd.next=evenhead;

        return head;
    }
}
