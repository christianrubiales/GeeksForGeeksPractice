package basic;

import java.util.Scanner;

public class SwapKthElements {

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
            
            int x = arr[k - 1];
            arr[k - 1] = arr[n - k];
            arr[n - k] = x;
            
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
	}
}