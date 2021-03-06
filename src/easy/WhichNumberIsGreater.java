package easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * BigInteger.
 * Can also use digit by digit comparison.
 */
public class WhichNumberIsGreater {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			BigInteger a = new BigInteger(in.next());
			BigInteger b = new BigInteger(in.next());

			if (a.compareTo(b) < 0) {
				System.out.println(1);
			} else if (a.compareTo(b) > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
	}

}
