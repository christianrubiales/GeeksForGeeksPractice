package easy;

import java.util.Scanner;

public class LastMatch {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String a = in.next();
            String b = in.next();
            
            int i = a.lastIndexOf(b);
            System.out.println(i == -1 ? -1 : i+1);
        }
	}
}
