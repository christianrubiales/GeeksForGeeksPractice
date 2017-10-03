package easy;

import java.util.Scanner;

public class RowWithMax1s {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int row = 0;
            int max = 0;
            
            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < m; j++) {
                    if (in.nextInt() == 1) {
                        c++;
                    }
                }
                if (c > max) {
                    max = c;
                    row = i;
                }
            }
            
            System.out.println(row);
        }
	}
}
