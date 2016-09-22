package binarytree;

public class Node {
    
    int data;
    Node left;
    Node right;
    boolean visited;
    
    public Node(int val)
    {
        data = val;
        left = right = null;
        visited = false;
    }

}
