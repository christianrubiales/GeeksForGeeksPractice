package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class KeyPair {

	public static void main (String[] args) throws Exception {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            String[] arr = in.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);
            
            Set<Integer> set = new HashSet<>();
            boolean contains = false;
            arr = in.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                if (set.contains(k - Integer.parseInt(arr[i]))) {
                    contains = true;
                    break;
                } else {
                    set.add(Integer.parseInt(arr[i]));
                }
            }
            
            System.out.println(contains ? "Yes" : "No");
        }
	}

}
