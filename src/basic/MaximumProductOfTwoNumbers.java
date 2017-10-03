package basic;

import java.util.Scanner;

public class MaximumProductOfTwoNumbers {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int n1 = 0;
            int n2 = 0;
            
            int x;
            for (int i = 0; i < n; i++) {
                x = in.nextInt();
                if (x > n1) {
                    n2 = n1;
                    n1 = x;
                } else if (x > n2) {
                    n2 = x;
                }
            }
            
            System.out.println(n1*n2);
        }
	}
}
