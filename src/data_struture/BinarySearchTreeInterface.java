package data_struture;

public interface BinarySearchTreeInterface {
    public void insert(int key);
    public BinarySearchTree.Node search(int item);
    public void remove(int key);
    public boolean contains();
    public void inorderTraversal();
    public void postorderTraversal();
    public void preorderTraversal();
}
