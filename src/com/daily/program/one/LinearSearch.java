/*** Linear Search or Sequential search
 * 1. Elements must be sorted
 * 2. Time complexity : O(n) */
package com.daily.program.one;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { -8, 2, 6, 8, 11, 15, 20 };
		int x = 15;
		int index = linearSearch(arr, x);
		if (index == -1) {
			System.out.println("Element not found");
		}
		System.out.println("Found!!!");

	}

	private static int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
