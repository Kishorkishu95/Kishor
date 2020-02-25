/**
 * Quick Sort Algorithm
 * 1. Divide and Conquer algorithm
 * 2. Recursive algorithm
 * 3. In-place algorithm
 * 4. Time complexity -- O(nlogn)
 * 5. Unstable algorithm
 * */

package com.daily.program.one;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { -5, 5, -8, 0, 6, 9, 12 };
		quickSort(arr, 0, arr.length);

		// Traverse an array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void quickSort(int arr[], int start, int end) {
		// If the unsorted length is less than 2 then return
		if (end - start < 2) {
			return;
		}
		// Pivot gives everything, left of the pivot will be smaller than pivot and
		// right of the pivot will be larger than the pivot

		int pivotIndex = partition(arr, start, end);
		quickSort(arr, start, pivotIndex); // Quick sorting the left sub array
		quickSort(arr, pivotIndex + 1, end); // Quick sorting the right sub array
	}

	private static int partition(int[] arr, int start, int end) {
		// This is using first element as a pivot
		int pivot = arr[start];
		int i = start;
		int j = end;

		while (i < j) {
			// Note :Empty loop
			while (i < j && arr[--j] >= pivot);
				
			if (i < j) {
				arr[i] = arr[j];
			}
			// Note : Empty loop
			while (i < j && arr[++i] <= pivot);
				
			if (i < j) {
				arr[j] = arr[i];
			}
		}
		arr[j] = pivot;
		return j;

	}
}