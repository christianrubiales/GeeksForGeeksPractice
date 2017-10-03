package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchingANumber {

	public static void main (String[] args) throws Exception {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {
            String[] arr = in.readLine().trim().split(" ");
            int n = Integer.parseInt(arr[0]);
            String k = arr[1];
            
            int x = -1;
            arr = in.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                if (arr[i].equals(k)) {
                    x = i + 1;
                    break;
                }
            }
            
            System.out.println(x);
        }
	}
}
