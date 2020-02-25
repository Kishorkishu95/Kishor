/***
 * Shell sort algorithm
 * 1. variation of insertion sort algorithm
 * 2. In-place algorithm
 * 3. Time complexity for worst case is O(n^2)
 * 4. Unstable algorithm
 * */
package com.daily.program.one;

public class ShellSort {

	public static void main(String[] args) {

		int[] arr = { 32, 15, -8, 10, 5, 15, -10 };

		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int newElement = arr[i];
				int j = i;
				while (j >= gap && arr[j - gap] > newElement) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = newElement;
			}
		}
		// Traverse an array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
