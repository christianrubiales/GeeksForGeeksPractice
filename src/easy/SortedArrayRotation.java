package easy;

import java.util.Scanner;

public class SortedArrayRotation {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            int x = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    x = i + 1;
                    break;
                }
            }
            
            System.out.println(x);
        }
	}
}
