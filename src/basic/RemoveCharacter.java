package basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveCharacter {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s1 = in.next();
            String s2 = in.next();
            Set<Character> set = new HashSet<>();
            
            for (int i = 0; i < s2.length(); i++) {
                set.add(s2.charAt(i));
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s1.length(); i++) {
                if (!set.contains(s1.charAt(i))) {
                    sb.append(s1.charAt(i));
                }
            }
            
            System.out.println(sb.toString());
        }
	}
}   