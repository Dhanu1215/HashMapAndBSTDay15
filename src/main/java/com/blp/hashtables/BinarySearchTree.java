package com.blp.hashtables;

/**
 * Create BinarySearchTree
 */
public class BinarySearchTree {

    //Represent the root of binary tree
    public INode root;

    public BinarySearchTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        //Add nodes to the binary tree
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        System.out.println("Binary search tree after insertion:");
        //Displays the binary tree  
        tree.display(tree.root);
    }

    private void insert(int data) {
        //Create a new node
        INode newNode = new INode(data);

        //Check whether tree is empty
        if (root == null) {
            root = newNode;
            return;
        } else {
            //current node point to root of the tree
            INode current = root, parent = null;

            while (true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    private void display(INode root) {
        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(root.left!= null)
                display(root.left);
            System.out.print(root.data + " ");
            if(root.right!= null)
                display(root.right);

        }
    }
}
