package easy;

import java.util.Scanner;

/**
 * Tricky with split("\\.").
 */
public class ReverseWordsInAGivenString {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
        	String temp = in.next();
            String[] arr = temp.split("\\.");
            
            for (int i = arr.length - 1; i > 0; i--) {
                System.out.print(arr[i]);
                System.out.print('.');
            }
            System.out.println(arr[0]);
        }
	}

}
