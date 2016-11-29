package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatingElement {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                Integer c = map.get(arr[i]);
                if (c == null) {
                    c = 0;
                }
                map.put(arr[i], c + 1);
            }
            for (int i = 0; i < n; i++) {
                if (map.get(arr[i]) > 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
	}
}
