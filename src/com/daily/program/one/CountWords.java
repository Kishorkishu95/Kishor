/**
 * Counting the words in a String
 * 1. Split the String into array of words by split() method by seperating with white spaces.
 * 2. Loop through the array and use HashMap to store
 * */
package com.daily.program.one;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {
		String str = "I will become rich at one day and i am waiting for the day to come";
		countWords(str);	
	}
	private static void countWords(String str) {
		String[] st = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<st.length; i++) {
			if(map.containsKey(st[i])) {
				int count = map.get(st[i]);
				map.put(st[i], count+1);
			}
			else {
				map.put(st[i], 1);
			}
		}
		System.out.println(map);
	}

}
