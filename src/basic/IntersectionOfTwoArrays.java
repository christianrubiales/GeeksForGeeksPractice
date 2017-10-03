package basic;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfTwoArrays {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            Set<Integer> a = new TreeSet<>();
            Set<Integer> b = new LinkedHashSet<>();
            
            for (int i = 0; i < n; i++) {
                a.add(in.nextInt());
            }
            for (int i = 0; i < m; i++) {
                b.add(in.nextInt());
            }
            
            int c = 0;
            for (int i : a) {
                if (b.contains(i)) {
                    System.out.print(i + " ");
                    c++;
                }
            }
            
            System.out.println(c == 0 ? "Zero" : "");
        }
	}
}
