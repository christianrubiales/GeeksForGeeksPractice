package basic;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
            int t = in.nextInt();

            while (t-- > 0) {
                int n = in.nextInt();
                int sum = 0;
                
                for (int i = 0; i < n - 1; i++) {
                    sum += in.nextInt();
                }
                System.out.println((n*(n+1)/2) - sum);
            }
	}
}
