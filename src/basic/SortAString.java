package basic;

import java.util.Arrays;
import java.util.Scanner;

public class SortAString {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            in.nextInt();
            String s = in.next();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            System.out.println(new String(c));
        }
	}
}
