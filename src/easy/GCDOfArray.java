package easy;

import java.util.Scanner;

public class GCDOfArray {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            int gcd = arr[0];
            
            if (n > 1) {
                gcd = gcd(arr[0], arr[1]);
                for (int i = 2; i < n; i++) {
                    gcd = gcd(gcd, arr[i]);
                }
            }
            
            System.out.println(gcd);
        }
	}
	
	public static int gcd(int a, int b) {
	    if (a % b == 0) {
	        return b;
	    } else {
	        return gcd(b, a % b);
	    }
	}
}
