package basic;

import java.util.Scanner;

public class BinaryNumberToDecimalNumber {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            int d = 0;
            int pow = 1;
            
            for (int i = s.length() - 1; i > -1; i--) {
                if (s.charAt(i) == '1') {
                    d += pow;
                }
                pow *= 2;
            }
            
            System.out.println(d);
        }
	}
}
