package medium;

import java.util.Scanner;

public class KadanesAlgorithm {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int mh = in.nextInt();
            int max = mh;
            
            for (int i = 1; i < n; i++) {
                int x = in.nextInt();
                mh = Math.max(mh + x, x);
                max = Math.max(mh, max);
            }
            
            System.out.println(max);
        }
	}
}
