package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Must ask a lot of cases in an actual interview.
 * ex: 598792C5510595B7F73BD67013132113A9ECBF7B64E0DF3554 -> 67013132113 (long)
 * Editorial actually recommended using a regex to detect strings with digits (\d+).
 */
public class ExtractTheNumberFromTheString {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while (t-- > 0) {
            String s = in.nextLine();
            s = s.replaceAll("[^0-9]+", " ");
            
            String[] arr = s.split("\\s+");
            List<Long> list = new ArrayList<>();
            
            for (String x : arr) {
            	try {
            		if (!x.contains("9")) {
            			list.add(Long.parseLong(x));
            		}
            	} catch (NumberFormatException e) {
            		continue;
            	}
            }
            
            if (list.isEmpty()) {
                System.out.println(-1);	
            } else {
            	Collections.sort(list, Collections.reverseOrder());
                System.out.println(list.get(0));
            }
        }
	}
}
