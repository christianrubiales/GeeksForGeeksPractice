package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumAndMinimumOfArrayElements {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int max = -1;
            int min = Integer.MAX_VALUE;
            
            int x;
            for (int i = 0; i < n; i++) {
                x = in.nextInt();
                if (x > max) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
            }
            
            System.out.println(max + " " + min);
        }
	}
}
