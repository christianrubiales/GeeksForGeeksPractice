package basic;

import java.util.Scanner;

public class SumOfPrimes {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            int sum = 0;
            
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '2' || c == '3' || c == '5' || c == '7') {
                    sum += Integer.parseInt("" + c);
                }
            }
            
            System.out.println(sum);
        }
	}
}