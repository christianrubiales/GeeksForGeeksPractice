package basic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LeadersInAnArray {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            Deque<Integer> stack = new ArrayDeque<>();
            int max = -1;
            for (int i = n - 1; i > -1; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                    stack.push(arr[i]);
                }
            }
            
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
	}
}