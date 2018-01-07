package basic;

import java.util.Scanner;

public class FaultyWiringAndBulbsQuadratic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}

			int flips = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] == 0) {
					flips++;
					for (int j = i; j < n; j++) {
						arr[j] = arr[j] == 0 ? 1 : 0;
					}
				}
			}
			System.out.println(flips);
		}
	}

}
