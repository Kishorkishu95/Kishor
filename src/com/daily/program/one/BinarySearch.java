/** Binary Search
 * 1. Data must be Sorted.
 * 2. Chooses the element in the middle of an array & compares it against the Search Value
 * 3. If the element at mid position is equal to search value, return that index.  
 * 	  if the element > Search value ---> Search in left half of an array
 * 	  if the element < Search value ---> Search in right half of an array
 * 	  
 */
package com.daily.program.one;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -10, -5, -1, 2, 5, 8, 11 };
		System.out.println("Index at : " + binarySearch(arr, 8));
	}

	private static int binarySearch(int[] arr, int searchValue) {
		int startIndex = 0;
		int endIndex = arr.length;
		while (startIndex < endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			if (arr[midIndex] == searchValue) {
				return midIndex;

			} else if (arr[midIndex] < searchValue) {
				startIndex = midIndex + 1;
			} else {
				endIndex = midIndex;
			}
		}
		return -1;

	}

}
