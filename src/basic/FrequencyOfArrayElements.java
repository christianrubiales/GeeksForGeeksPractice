package basic;

import java.util.Scanner;

public class FrequencyOfArrayElements {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[in.nextInt() - 1]++;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
	}
}
