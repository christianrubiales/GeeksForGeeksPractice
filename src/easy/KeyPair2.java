package easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KeyPair2 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            
            Set<Integer> set = new HashSet<>();
            boolean contains = false;
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (set.contains(k - x)) {
                    contains = true;
                } else {
                    set.add(x);
                }
            }
            
            System.out.println(contains ? "Yes" : "No");
        }
	}

}
