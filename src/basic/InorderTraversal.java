package basic;


public class InorderTraversal {

    void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    
    class Node {
        int data;
        Node left, right;
       Node(int item)    {
            data = item;
            left = right = null;
        }
    }
}
