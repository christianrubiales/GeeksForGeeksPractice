package basic;

import java.util.Scanner;

public class FactorialNumber {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    
	    while (n-- > 0) {
	        int i = 1;
	        int f = 1;
	        int x = in.nextInt();
	        
	        while (f < x) {
	            f = f * (i+1);
	            i++;
	        }
	        System.out.println(f == x ? 1 : 0);
	    }
	}
}