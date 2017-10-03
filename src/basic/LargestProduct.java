package basic;

import java.util.Scanner;

public class LargestProduct {

	long findMaxProduct(int A[], int n, int k) {
		long product = 1L;

		for (int i = 0; i < k; i++) {
			product *= A[i];
		}
		long max = product;
		for (int i = k; i < n; i++) {
			product /= A[i - k];
			product *= A[i];

			if (product > max) {
				max = product;
			}
		}

		return max;
	}
}
