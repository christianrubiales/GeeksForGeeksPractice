package basic;

import java.util.Scanner;

public class PowerOf2 {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            System.out.println(Long.bitCount(in.nextLong()) == 1 ? "YES" : "NO");
        }
	}
}
