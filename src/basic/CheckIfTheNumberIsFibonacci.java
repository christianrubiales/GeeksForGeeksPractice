package basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckIfTheNumberIsFibonacci {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        Set<Integer> set = new HashSet<>();
        int f2 = 0;
        int f1 = 1;
        //set.add(0);
        
        int x = 0;
        do {
            x = f1+f2;
            set.add(x);
            f2 = f1;
            f1 = x;
        } while (x < 101);

        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(set.contains(n) ? "Yes" : "No");
        }
	}
}
