package com.vineet.Tutort.LinkedList;

import java.util.Arrays;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next = new Node(3);

        Node ans = removeElements(n1,3);

        while(ans != null){
            System.out.print(ans.data+"-->");
            ans= ans.next;
        }

    }

    public static Node removeElements(Node head, int val) {

        if(head == null)
            return head;

        Node dummy = new Node(0);
        dummy.next=head;

        Node curr=dummy;

        while(curr.next !=null){

            if(curr.next.data == val){
                curr.next = curr.next.next;
            }else{
                curr= curr.next;
            }
        }
        return dummy.next;
    }
}
