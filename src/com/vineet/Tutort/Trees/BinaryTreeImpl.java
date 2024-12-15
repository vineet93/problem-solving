package com.vineet.Tutort.Trees;

public class BinaryTreeImpl {
    //https://leetcode.com/problems/binary-tree-inorder-traversal/
    public static void inOrder(Node root){

        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    //https://leetcode.com/problems/binary-tree-postorder-traversal/
    public static void postOrder(Node root){

        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    public static void preOrder(Node root){

        if(root == null)
            return;

        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    //https://leetcode.com/problems/minimum-depth-of-binary-tree/
    public static int minimumDepth(Node root){

        if(root == null) {
            return 0;
        }

        if (root.left == null) {
            return minimumDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minimumDepth(root.left) + 1;
        }
        return Math.min(minimumDepth(root.left), minimumDepth(root.right)) + 1;
    }


    //https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
    public int maxDepth(Node root) {

        if(root == null)
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth,rightDepth);
    }

    public int heightOfTree(Node root) {

        if(root == null)
            return 0;

        int leftTreeHeight = heightOfTree(root.left);
        int rightTreeHeight = heightOfTree(root.right);

        return 1 + Math.max(leftTreeHeight,rightTreeHeight);
    }
    //https://leetcode.com/problems/binary-tree-level-order-traversal/description/
    public void levelOrderTraversal(Node root) {

        int height = heightOfTree(root);
        for(int i=1;i<=height;i++){
            printGivenLevel(root,i);
        }
    }

    private void printGivenLevel(Node root, int level) {

        if(root == null) {
            return;
        } else if(level == 1){
            System.out.print(root.data+" ");
        } else if(level > 1){
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }

    public void zigZagTraversal(Node root) {

        int level = heightOfTree(root);
        String flag;
        for(int i=1;i<=level;i++) {
            if(i % 2 != 0) {
                flag ="right";
                printGivenLevelSpiral(root,i,flag);
            }else {
                flag ="left";
                printGivenLevelSpiral(root,i,flag);
            }
        }

    }

    private void printGivenLevelSpiral(Node root, int level, String flag) {

        if(root == null) {
            return;
        } else if(level == 1){
            System.out.print(root.data+" ");
        } else if(level > 1){
            if(flag == "right") {
                printGivenLevelSpiral(root.left, level - 1,flag);
                printGivenLevelSpiral(root.right, level - 1,flag);
            }else {
                printGivenLevelSpiral(root.right, level - 1,flag);
                printGivenLevelSpiral(root.left, level - 1,flag);
            }
        }
    }
}
