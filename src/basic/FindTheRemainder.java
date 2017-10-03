package basic;

import java.math.BigInteger;
import java.util.Scanner;

public class FindTheRemainder {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            System.out.println(new BigInteger(in.next()).mod(new BigInteger("7")));
        }
	}
}