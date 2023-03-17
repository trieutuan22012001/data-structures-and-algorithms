package data_struture;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarytree = new BinarySearchTree();
        binarytree.insert(1);
        binarytree.insert(13);
        binarytree.insert(3);
        binarytree.insert(9);
        binarytree.insert(5);
        binarytree.insert(10);
        binarytree.insert(7);
        // Test inorder traversal
        System.out.print("Inorder traversal: ");
        binarytree.inorderTraversal();
        System.out.println();
        System.out.print("Post traversal: ");
        binarytree.postorderTraversal();
        System.out.println();
        System.out.print("preorder traversal: ");
        binarytree.preorderTraversal();
        System.out.println();

        // Test inorder traversal
        BinarySearchTree.Node result1 = binarytree.search(1);
        if (result1 != null) {
            System.out.println("Key 4 found in the tree");
        } else {
            System.out.println("Key 4 not found in the tree");
        }



    }

}