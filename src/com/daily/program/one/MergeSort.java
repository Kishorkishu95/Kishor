/**
 *  Merge Sort Algorithm
 *  1. Divide and conquer algorithm
 *  2. Recursive algorithm
 *  3. Two phases : Splitting and Merging
 *  4. Not an In-place algorithm
 *  5. Time complexity : O(nlogn)
 *  6. Stable algorithm
 * */
package com.daily.program.one;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 9, -8, 12, 5, 1, -9, -5 };
		mergeSort(arr, 0, arr.length);

		// Traverse an array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void mergeSort(int[] arr, int start, int end) {
		if (end - start < 2) {
			return;
		}
		int mid = (start + end) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		if (arr[mid - 1] <= arr[mid]) {
			return;
		}
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end - start];
		while (i < mid && j < end) {
			temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
		System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, arr, start, tempIndex);

	}

}
