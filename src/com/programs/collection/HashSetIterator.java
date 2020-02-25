package com.programs.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Virat");
		set.add("Rohit");
		set.add("Rahul");
		set.add("Hardik");
		set.add("Mayank");
		
		System.out.println("Traversing the set using iterator");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
	}

}
