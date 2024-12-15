package com.vineet.Tutort.Trees;

public class BinaryTree {

    public static void main(String[] args) {
        Node root = null;
        BinaryTreeImpl bt= new BinaryTreeImpl();
        root = new Node(3);
        root.left= new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(" Inorder Traversal");
        bt.inOrder(root);
        System.out.println();
        System.out.println(" PostOrder Traversal");
        bt.postOrder(root);
        System.out.println();
        System.out.println(" PreOrder Traversal");
        bt.preOrder(root);
        System.out.println();
        int minDepth= bt.minimumDepth(root);
        System.out.println(" Minimum Depth is " + minDepth);
        System.out.println();
        int maxDepth= bt.maxDepth(root);
        System.out.println(" Maximum Depth is " + maxDepth);
        System.out.println();
        int height = bt.heightOfTree(root);
        System.out.println(" Height of Tree is "+ height);
        System.out.println();
        System.out.println(" Level Order Traversal");
        bt.levelOrderTraversal(root);
        System.out.println();
        System.out.println(" Spiral or Zig Zag Traversal");
        bt.zigZagTraversal(root);
        System.out.println();


    }
}
