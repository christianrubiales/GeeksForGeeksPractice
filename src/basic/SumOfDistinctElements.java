package basic;

import java.util.BitSet;
import java.util.Scanner;

public class SumOfDistinctElements {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            BitSet set = new BitSet(n + 1);
            
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (!set.get(x)) {
                    set.set(x);
                    sum += x;
                }
            }
            
            System.out.println(sum);
        }
	}
}