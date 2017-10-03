package basic;

import java.util.Scanner;

public class MaximumOccuringCharacter {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            int[] counts = new int[26];
            
            for (int i = 0; i < s.length(); i++) {
                counts[s.charAt(i) - 'a']++;
            }
            
            char c = 'a';
            int max = -1;
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > max) {
                    max = counts[i];
                    c = (char)(((char) i) + 'a');
                }
            }
            System.out.println(c);
        }
	}
}
