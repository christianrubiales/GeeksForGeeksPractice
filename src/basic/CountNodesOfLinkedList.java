package basic;


public class CountNodesOfLinkedList {

	public int getCount(LinkedList list) {
		Node node = list.head;

		int count = 0;

		if (node != null) {
			while (node != null) {
				count++;
				node = node.next;
			}
		}
		return count;
	}

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	class LinkedList {
		Node head; // head of list
	}
}
