package easy;

import java.util.Scanner;

public class SortAnArrayOf0s1sAnd2s {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[3];
            
            for (int i = 0; i < n; i++) {
                arr[in.nextInt()]++;
            }
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
	}
}
