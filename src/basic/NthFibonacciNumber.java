package basic;

import java.math.BigInteger;
import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt() - 1;
            
            if (n == 0) {
                System.out.println(0);
            } else if (n == 1) {
                System.out.println(1);
            } else {
                BigInteger f1 = new BigInteger("1");
                BigInteger f2 = new BigInteger("0");
                
                for (int i = 2; i <= n; i++) {
                    BigInteger x = f1.add(f2);
                    f2 = f1;
                    f1 = x;
                }
                System.out.println(f1.mod(new BigInteger("1000000007")));
            }
        }
	}
}