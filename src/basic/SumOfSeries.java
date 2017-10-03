package basic;

import java.util.Scanner;

public class SumOfSeries {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(n*(n+1)/2);
        }
	}
}
