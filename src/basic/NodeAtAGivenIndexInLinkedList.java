package basic;

public class NodeAtAGivenIndexInLinkedList {

	// Should return data of node at given index. The function may
	// assume that there are at least index+1 nodes in linked list
	public int GetNth(LinkedList l, int index) {
		Node node = l.head;
		int i = 0;

		while (i < index) {
			node = node.next;
			i++;
		}

		return node.data;
	}

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	class LinkedList
	{
	    Node head;  // head of list
	}
}
