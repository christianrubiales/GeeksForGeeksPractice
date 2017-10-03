package basic;

import java.util.Scanner;

public class ParityOfUnsignedInteger {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(Integer.bitCount(n) % 2 == 0 ? "even" : "odd");
        }
	}
}
