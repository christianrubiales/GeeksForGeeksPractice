package basic;

import java.util.Scanner;

public class KeypadTyping {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            
            char c;
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                switch (c) {
                    case 'a':
                    case 'b':
                    case 'c':
                        System.out.print('2');
                        break;
                    case 'd':
                    case 'e':
                    case 'f':
                        System.out.print('3');
                        break;
                    case 'g':
                    case 'h':
                    case 'i':
                        System.out.print('4');
                        break;
                    case 'j':
                    case 'k':
                    case 'l':
                        System.out.print('5');
                        break;
                    case 'm':
                    case 'n':
                    case 'o':
                        System.out.print('6');
                        break;
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                        System.out.print('7');
                        break;
                    case 't':
                    case 'u':
                    case 'v':
                        System.out.print('8');
                        break;
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        System.out.print('9');
                }
            }
            System.out.println();
        }
	}
}