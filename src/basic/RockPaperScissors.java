package basic;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            
            if (s.equals("RR") || s.equals("PP") || s.equals("SS")) {
                System.out.println("DRAW");
            } else if (s.equals("RS") || s.equals("PR") || s.equals("SP")) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
            
        }
	}
}