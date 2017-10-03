package easy;

import java.util.Scanner;

public class BuildingsReceivingSunlight {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int max = 0;
            int count = 0;
            int current = 0;
            
            for (int i = 0; i < n; i++) {
                current = in.nextInt();
                if (current >= max) {
                    max = current;
                    count++;
                }
            }
            
            System.out.println(count);
        }
	}
}
