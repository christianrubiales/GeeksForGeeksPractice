package basic;

import java.util.Scanner;

public class UnionOfTwoArrays {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            
            int[] U = new int[1001];
            
            for (int i = 0; i < n; i++) {
            		U[in.nextInt()]++;
            }
            
            for (int i = 0; i < m; i++) {
            		U[in.nextInt()]++;
            }
            
            for (int i = 0; i < 1001; i++) {
            		if (U[i] > 0) {
            			System.out.print(i + " ");
            		}
            }
			System.out.println();
        }
	}
}