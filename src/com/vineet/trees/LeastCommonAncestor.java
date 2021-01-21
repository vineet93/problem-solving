package com.vineet.trees;

public class LeastCommonAncestor {
	
public Node insert(Node node,int data) {
		
		if(node == null) {
			return createNewNode(data);
		}
		
		if(data < node.data) {
			node.left= insert(node.left,data);
		}else if(data > node.data) {
			node.right= insert(node.right,data);
		}
	
		return node; 
		
	}

private Node createNewNode(int data) {
	
	Node node = new Node();
	node.data=data;
	node.left=null;
	node.right=null;
	
	return node;
}

Node lca(Node node, int n1, int n2)  
{ 
    if (node == null) 
        return null; 

    // If both n1 and n2 are smaller than root, then LCA lies in left 
    if (node.data > n1 && node.data > n2) 
        return lca(node.left, n1, n2); 

    // If both n1 and n2 are greater than root, then LCA lies in right 
    if (node.data < n1 && node.data < n2)  
        return lca(node.right, n1, n2); 

    return node; 
} 

	public static void main(String[] args) {
		
		Node root = null;
		
		LeastCommonAncestor lca = new LeastCommonAncestor();
		root = lca.insert(root, 20);
		lca.insert(root, 8);
		lca.insert(root, 22);
		lca.insert(root, 4);
		lca.insert(root, 12);
		lca.insert(root, 10);
		lca.insert(root, 14);
		
		int n1 = 4, n2 = 22; 
        Node t = lca.lca(root, n1, n2); 
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
   
        n1 = 14; 
        n2 = 8; 
        t = lca.lca(root, n1, n2); 
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
   
        n1 = 10; 
        n2 = 22; 
        t = lca.lca(root, n1, n2); 
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);	

	}

}
