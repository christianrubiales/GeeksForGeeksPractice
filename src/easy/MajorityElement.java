package easy;

import java.util.Scanner;

public class MajorityElement {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            Integer m = null;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (m == null) {
                    m = arr[i];
                    count = 1;
                } else if (m == arr[i]) {
                    count++;
                } else {
                    count--;
                    if (count == 0) {
                        m = null;
                    }
                }
            }
            
            if (m != null) {
                count = 0;
                
                for (int i = 0; i < n; i++) {
                    if (arr[i] == m) {
                        count++;
                    }
                }
                if (count > n / 2) {
                    System.out.println(m);
                } else {
                    System.out.println("NO Majority Element");
                }
            } else {
                System.out.println("NO Majority Element");
            }
            
        }
	}

}
