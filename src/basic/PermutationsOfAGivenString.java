package basic;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class PermutationsOfAGivenString {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            SortedSet<String> set = new TreeSet<>();
            permute("", s, set);
            
            for (String x : set) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
	}
	
	static void permute(String p, String s, SortedSet<String> set) {
	    if (s.length() == 0) {
	        set.add(p);
	    } else {
	        for (int i = 0; i < s.length(); i++) {
	            permute(p + s.charAt(i), s.substring(0, i) + s.substring(i+1), set);
	        }
	    }
	}
}