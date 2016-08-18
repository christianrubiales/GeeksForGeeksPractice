package easy;

import java.util.Scanner;

public class OrderingOfStrings {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            
            String min = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
            String max = "a";
            String temp = null;
            
            for (int i = 0; i < n; i++) {
                temp = in.next();
                if (temp.compareTo(min) < 0) {
                    min = temp;
                }
                if (temp.compareTo(max) > 0) {
                    max = temp;
                }
            }
            
            System.out.println(min + " " + max);
        }
	}

}
