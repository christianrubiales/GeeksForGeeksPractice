package easy;

import java.util.Scanner;

public class SumOfMiddleElementsOfTwoSortedArarys {

	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = in.nextInt();
            }
            
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = in.nextInt();
            }
            
            int i = 0;
            int j = 0;
            int mid = 0;
            int sum = 0;
            
            while (i + j < n) {
                if (arr1[i] < arr2[j]) {
                    mid = arr1[i];
                    i++;
                } else {
                    mid = arr2[j];
                    j++;
                }
            }
            
            if (i == n) {
                sum = mid + arr2[j];
            } else if (j == n) {
                sum = mid + arr1[i];
            } else if (arr1[i] < arr2[j]) {
                sum = mid + arr1[i];
            } else {
                sum = mid + arr2[j];
            }
            
            System.out.println(sum);
        }
	}
}
