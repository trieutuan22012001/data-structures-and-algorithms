package data_struture;

import java.util.NoSuchElementException;

public class BinarySearchTree implements BinarySearchTreeInterface{
    // create Node
     class Node{
        private int key;
        private Node left, right;
          Node(int data){
            this.key = data;
            left = right = null;
        }
    }
    private Node root;
     public BinarySearchTree(){
         root = null;
    }

    // public method
    @Override
    public void insert(int key) {
        root = insert(root, key);
    }

    @Override
    public Node search(int key) {
        return search(root, key);
    }


    private Node search(Node node, int key) {
        if (node == null) return null;
        if (node.key == key) return node;
        else if (node.key > key) {
            return search(node.left,key);
        }else {
            return search(node.right, key);
        }
    }

    private Node insert(Node node, int key) {
         if (node == null){
             return new Node(key);
         }
         if (key < node.key){
                node.left = insert(node.left,key);
         }
         else {
             node.right = insert(node.right,key);
         }
         return node;
    }

    @Override
    public void remove(int key) {
        root = remove(root, key);
    }


    private Node remove(Node node, int key) {
         if (node == null){
             return null;
         } else if (key < node.key) {
             node.left = remove(node.left, key);
         } else if (key > node.key) {
             node.right = remove(node.right,key);
         }else{
             if (node.left == null){
                 return node.right;
             } else if (node.right == null) {
                 return node.left;
             }else{
                 Node temp = node.right;
                 while (temp.left != null){
                     temp = temp.left;
                 }
                 node.key = temp.key;
                 node.right = remove(node.right, temp.key);
             }
         }
         return node;
    }

    @Override
    public boolean contains(int key) {
        return contains(root, key);
    }

    @Override
    public int min() {
        if (root == null){
            throw new NoSuchElementException();
        }
        Node temp = root;
        while (temp.left != null){
            temp = temp.left;
        }
        return temp.key;
    }




    @Override
    public int max() {
        if (root == null){
            throw new NoSuchElementException();
        }
        Node temp = root;
        while ( temp.right != null){
            temp = temp.right;
        }
        return temp.key;
    }

    private boolean contains(Node node, int key) {
         if (node == null){
             return false;
         } if (node.key == key) {
             return true;
         } else if (key >node.key) {
            return contains(node.right, key);
        } else{
            return contains(node.left, key);
        }
    }

    @Override
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    @Override
    public void postorderTraversal() {
        postorderTraversal(root);
    }

    @Override
    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void preorderTraversal(Node node) {
         if (node!=null){
             System.out.print(node.key + " ");
             preorderTraversal(node.left);
             preorderTraversal(node.right);
         }
    }

    private void postorderTraversal(Node node) {
         if(node!=null){
             postorderTraversal(node.left);
             postorderTraversal(node.right);
             System.out.print(node.key + " ");
         }
    }

    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }
}
