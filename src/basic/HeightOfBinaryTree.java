package basic;

public class HeightOfBinaryTree {

    int height(Node node) 
    {
        if (node != null) {
            return 1 + Math.max(height(node.left), height(node.right));
        } else {
            return 0;
        }
    }
    
    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
}
