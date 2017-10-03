package basic;

import java.util.Scanner;

public class PalindromeString {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            String s = in.next();
            
            boolean palindrome = true;
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    palindrome = false;
                    break;
                }
                i++;
                j--;
            }
            
            System.out.println(palindrome ? "Yes" : "No");
        }
	}
}
