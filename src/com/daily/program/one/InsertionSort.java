/**
 * Insertion Sort Algorithm
 *  1. In-place algorithm
 *  2. Time complexity is O(n^2)
 *  3. Stable algorithm
 */
package com.daily.program.one;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { -10, 5, -8, 6, 7, 12, 5, 4 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
			int newElement = arr[firstUnsortedIndex];
			int i;
			for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
				arr[i] = arr[i - 1];
			}
			arr[i] = newElement;
		}
		// Traverse an array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
