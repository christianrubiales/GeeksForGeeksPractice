package school;

import java.util.Scanner;

public class LowerCaseToUpperCase {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            
            for (int i = 0; i < s.length(); i++) {
                char c = (char) (s.charAt(i) - (char) 'a');
                System.out.print((char) ('A' + (char) c));
            }
            System.out.println();
        }
	}
}
