package basic;

import java.util.Scanner;

public class LcmOfGivenArrayElements {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            
            int lcm = 0;
            if (n == 1) {
                lcm = in.nextInt();
            } else {
                lcm = lcm(in.nextInt(), in.nextInt());
                for (int i = 2; i < n; i++) {
                    lcm = lcm(lcm, in.nextInt());
                }
            }
            
            System.out.println(lcm);
        }
	}
	
	static int lcm(int a, int b) {
	    return a*b/gcd(a,b);
	}
	
	static int gcd(int a, int b) {
	    if (a % b == 0) {
	        return b;
	    } else {
	        return gcd(b, a % b);
	    }
	}
}