package com.vineet.Tutort.LinkedList;

public class ReverseLinkedList2 {

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

        Node ans = reverseListRange(n1,2,5);

        System.out.println("After Reverse");
        while (ans != null) {
            System.out.print(ans.data + "-->");
            ans = ans.next;
        }
    }

    public static Node reverseListRange(Node head,int left,int right) {
        if (head == null || left == right) return head;

        Node dummy = new Node(0);
        dummy.next=head;

        Node prev=dummy;
        Node curr=head;

        for(int i=0;i<left-1;i++){
            prev = prev.next;
            curr = curr.next;
        }

        for(int i=0;i<right-left;i++){
            Node next = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = next;
        }

        return dummy.next;
    }
}
