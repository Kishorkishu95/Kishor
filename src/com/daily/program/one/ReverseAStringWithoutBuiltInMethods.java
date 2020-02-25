/**
 * Reverse a given String without using built-in methods
 *  1. Convert the given String into Array of characters using toCharArray() method.
 *  2. Loop through from the last character or in reverse order
 * */
package com.daily.program.one;

public class ReverseAStringWithoutBuiltInMethods {

	public static void main(String[] args) {
		String str = new String("CRICKET");
		reverseString(str);
	}

	private static void reverseString(String str) {
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
