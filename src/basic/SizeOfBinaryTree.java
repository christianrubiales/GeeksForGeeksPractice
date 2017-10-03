package basic;

public class SizeOfBinaryTree {

    // Should return number of nodes in tree
    int getSize(Node root)
    {
       if (root != null) {
           return 1 + getSize(root.left) + getSize(root.right);
       }
       return 0;
    }
    
    class Node {
    	   int data;
    	   Node left, right;
    	   Node(int item) {
    	      data = item;
    	      left = right = null;
    	   }
    	}
}
