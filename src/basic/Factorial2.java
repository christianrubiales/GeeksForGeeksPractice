package basic;

import java.util.Scanner;

public class Factorial2 {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
	        long[] factorials = new long[20];
	        factorials[0] = 1;
	        factorials[1] = 1;
	        
	        for (int i = 2; i < 20; i++) {
	            factorials[i] = i * factorials[i-1];
	        }
	        
            System.out.println(factorials[in.nextInt()]);
        }
    }
}
