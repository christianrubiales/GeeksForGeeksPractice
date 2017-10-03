package easy;

import java.util.Scanner;

public class AreTwoStringsAnagrams {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String a = in.next();
            String b = in.next();
            
            if (a.length() != b.length()) {
                System.out.println("NO");
                continue;
            }
            
            int[] a1 = new int[26];
            int[] b1 = new int[26];
            
            for (int i = 0; i < a.length(); i++) {
                a1[a.charAt(i) - 'a']++;
            }
            for (int i = 0; i < b.length(); i++) {
                b1[b.charAt(i) - 'a']++;
            }
            
            boolean anagram = true;
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != b1[i]) {
                    anagram = false;
                    break;
                }
            }
            
            System.out.println(anagram ? "YES" : "NO");
        }
	}
}
