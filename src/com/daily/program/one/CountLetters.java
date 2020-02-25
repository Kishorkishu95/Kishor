/**
 * Counting the Characters in a String
 * 1. Split the String into array of words by split() method by separating each letters.
 * 2. Loop through the array and use HashMap to store
 * */
package com.daily.program.one;

import java.util.HashMap;

public class CountLetters {

	public static void main(String[] args) {
		String str = "Today we have 4th T20I against Newzealand";
		countCharacters(str);

	}

	private static void countCharacters(String str) {
		String[] st = str.split("");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < st.length; i++) {
			if (map.containsKey(st[i])) {
				int countChars = map.get(st[i]);
				map.put(st[i], countChars + 1);
			}
			map.put(st[i], 1);
		}
		System.out.println(map);

	}

}
