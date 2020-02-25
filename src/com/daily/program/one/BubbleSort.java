/**
 *  Bubble Sort Algorithm
 *  1. Stable algorithm
 *  2. Time complexity is O(n^2)
 */
package com.daily.program.one;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { -10, 5, -20, 15, 12, 5, 6 };
		// Checking the conditions
		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}
		// Traverse the sorted elements
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Swap method implementation
	private static void swap(int arr[], int i, int j) {
		if (i == j) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
