package basic;

import java.util.Scanner;

public class ValueEqualToIndexValue {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (i+1 == in.nextInt()) {
                    System.out.print((i+1) + " ");
                    c++;
                }
            }
            System.out.println(c == 0 ? "Not Found" : "");
        }
	}
}
