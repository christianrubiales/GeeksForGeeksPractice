package basic;

import java.util.Scanner;

public class ImplementStackUsingArray {

	/* The method push to push element into the stack */
	void push(int a, Stack_using_array ob) {
		ob.top++;
		ob.arr[ob.top] = a;
	}

	/* The method pop which return the element poped out of the stack */
	int pop(Stack_using_array ob) {
		if (ob.top < 0) {
			return -1;
		}
		int value = ob.arr[ob.top];
		// ob.arr[top] = -1;
		ob.top--;
		return value;
	}

	class Stack_using_array {

		int top;
		int arr[] = new int[1000];

		Stack_using_array() {
			top = -1;
		}
	}
}
