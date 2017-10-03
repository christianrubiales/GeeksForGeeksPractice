package basic;

import java.util.Scanner;

public class TotalCount {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int c = 0;
            
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (x <= k) {
                    c++;
                } else {
                    c += (x/k) + (x % k == 0 ? 0 : 1);
                }
            }
            
            System.out.println(c);
        }
	}
}