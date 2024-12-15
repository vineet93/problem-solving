package com.vineet.Tutort.LinkedList;

public class MergeSortedList {
    public static void main(String[] args) {

        Node n1= new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(5);

        Node n2= new Node(1);
        n2.next = new Node(3);
        n2.next.next = new Node(4);

        Node ans = mergeTwoLists(n1,n2);

        while(ans != null){
            System.out.println(ans.data);
            ans = ans.next;
        }

    }

    public static Node mergeTwoLists(Node list1, Node list2) {

        if(list1 == null && list2==null)
            return null;

        Node prehead = new Node(-1);
        Node curr = prehead;

        while(list1 !=null && list2 !=null){

            if(list1.data <= list2.data){
                curr.next=list1;
                list1 = list1.next;
            } else{
                curr.next=list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 == null){
            curr.next = list2;
        } else {
            curr.next = list1;
        }

        return prehead.next;
    }

}
