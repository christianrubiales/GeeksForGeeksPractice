package basic;

import java.util.Scanner;

public class ReverseSubArray {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            int x;
            while (a < b) {
                x = arr[a];
                arr[a] = arr[b];
                arr[b] = x;
                a++;
                b--;
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
	}
}