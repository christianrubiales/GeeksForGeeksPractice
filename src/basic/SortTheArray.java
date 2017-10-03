package basic;

import java.util.Scanner;

public class SortTheArray {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[101];
            
            for (int i = 0; i < n; i++) {
                arr[in.nextInt()]++;
            }
            
            for (int i = 0; i < 101; i++) {
                if (arr[i] > 0) {
                    for (int j = 0; j < arr[i]; j++) {
                        System.out.print(i + " ");
                    }
                }
            }
            System.out.println();
        }
	}
}
