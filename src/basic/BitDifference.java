package basic;

import java.util.Scanner;

public class BitDifference {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Integer.bitCount(a^b));
        }
	}
}
