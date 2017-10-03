package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberOfOccurrence {

	public static void main (String[] args) throws Exception {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
    			String[] s = in.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            int c = 0;

    			s = in.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                if (x == Integer.parseInt(s[i])) {
                    c++;
                }
            }
            
            System.out.println(c == 0 ? -1 : c);
        }
	}
}