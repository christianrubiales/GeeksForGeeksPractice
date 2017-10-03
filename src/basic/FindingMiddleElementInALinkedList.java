package basic;

public class FindingMiddleElementInALinkedList {

    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
         Node fast = head;
         Node slow = head;
         
         while (fast != null && fast.next != null) {
             fast = fast.next.next;
             slow = slow.next;
         }
         return slow.data;
   }
    
    class Node {
    	   int data;
    	    Node next;
    	    Node(int d)  { data = d;  next = null; }
    	}
}
