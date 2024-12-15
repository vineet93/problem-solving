package com.vineet.Tutort.LinkedList;

public class removeNthNodeFromEnd {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);

       Node ans = removeNthFromEnd(n1,2);

       while(ans != null){
           System.out.print(ans.data+"-->");
           ans= ans.next;
       }
    }

    public static Node removeNthFromEnd(Node head, int n) {

        Node fast = head;
        Node slow = head;

        while(n!=0){
            fast = fast.next;
            n--;
        }

        if (fast == null)
            return head.next;

        while(fast.next !=null) {
        slow = slow.next;
        fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
