package easy;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumGap {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            
            int max = 0;
            for (int i = 0; i < n - 1; i++) {
                max = Math.max(max, arr[i+1] - arr[i]);
            }
            
            System.out.println(max);
        }
	}
}
