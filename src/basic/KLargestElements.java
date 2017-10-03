package basic;

import java.util.Arrays;
import java.util.Scanner;

public class KLargestElements {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
            int t = in.nextInt();

            while (t-- > 0) {
                int n = in.nextInt();
                int k = in.nextInt();
                int[] arr = new int[n];
                
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                Arrays.sort(arr);
                
                for (int i = n - 1; i >= n - k; i--) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
	}
}