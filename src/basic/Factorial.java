package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Factorial {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);
        map.put(1, 1L);
        long fact = 1;
        for (int i = 2; i < 19; i++) {
            fact *= i;
            map.put(i, fact);
        }

        while (t-- > 0) {
            System.out.println(map.get(in.nextInt()));
        }
	}
}
