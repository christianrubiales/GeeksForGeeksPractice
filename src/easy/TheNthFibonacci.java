package easy;

import java.util.Scanner;

/**
 * Find the last digit of the N'th Fibonacci
 */
public class TheNthFibonacci {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int[] fib = new int[1001];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < 1001; i++) {
        	fib[i] = fib[i-1] + fib[i-2];
        	fib[i] = fib[i] - (fib[i]/10*10);
        }
        
        while (t-- > 0) {
            System.out.println(fib[in.nextInt()]);
        }
	}

}
