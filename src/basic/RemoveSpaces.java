package basic;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while (t-- > 0) {
            String s = in.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
	}
}
