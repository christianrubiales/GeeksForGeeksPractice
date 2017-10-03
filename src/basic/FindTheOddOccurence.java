package basic;

import java.util.Scanner;

public class FindTheOddOccurence {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int odd = in.nextInt();
            
            for (int i = 1; i < n; i++) {
                odd ^= in.nextInt();
            }
            
            System.out.println(odd);
        }
	}
}