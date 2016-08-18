package easy;

import java.util.Scanner;

/**
 * Ex: 
 * "acbac" -> ""
 * "aababc" -> "aaac"
 */
public class RemoveBAndACFromAGivenString {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'b') {
                	continue;
                } else if (s.charAt(i) == 'a' && i < s.length() - 1 && s.charAt(i+1) == 'c') {
                	i++;
                	continue;
                } else {
                	System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
	}

}
