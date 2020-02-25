package com.daily.program.one;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] arr = { -15, -5, 1, 5, 10, 15, 25, 50 };
		int x = 10;
		System.out.println(recursiveBinarySearch(arr, x));

	}

	private static int recursiveBinarySearch(int[] arr, int x) {

		return recursiveBinary(arr, 0, arr.length, x);
	}

	private static int recursiveBinary(int[] arr, int start, int end, int x) {
		if (start >= end) {
			return -1;
		}
		int mid = (start + end) / 2;
		System.out.println("Midpoint is " + mid);
		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] < x) {
			return recursiveBinary(arr, mid + 1, end, x);
		} else {
			return recursiveBinary(arr, start, mid, x);
		}

	}

}
