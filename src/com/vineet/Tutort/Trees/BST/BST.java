package com.vineet.Tutort.Trees.BST;

public class BST {

    static class Node {
        int key;
        Node left, right;
    }

    // To create new BST Node
    static Node newNode(int item)
    {
        Node temp = new Node();
        temp.key = item;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    static Node insert(Node node, int key)
    {
        // if tree is empty return new node
        if (node == null)
            return newNode(key);

        // if key is less than or greater than
        // node value then recur down the tree
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);

        // return the (unchanged) node pointer
        return node;
    }

    public static void main(String[] args)
    {
        int N = 4;

        // creating following BST
    /*
                5
            / \
            2     12
        / \ / \
        1 3 9 21
                    / \
                    19 25 */
        Node root = null;
        root = insert(root, 25);
        insert(root, 2);
        insert(root, 1);
        insert(root, 3);
        insert(root, 12);
        insert(root, 9);
        insert(root, 21);
        insert(root, 19);
        insert(root, 25);
    }
}
