package com.programs.collection;

import java.util.ArrayList;

public class ConverArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ball");
		list.add("Cat");
		list.add("Dog");
		System.out.println("ArrayList items are : "+list);
		
		// Conversion
//		String[] array = new String[list.size()];
//		for (int i=0; i<list.size(); i++) {
//			array[i] = list.get(i);
//		}
		 String array[]=list.toArray(new String[list.size()]);

		for(String s : array) {
			System.out.println(s);
		}
	}

}
