package com.programs.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTraverse {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "India");
		map.put(2, "USA");
		map.put(3, "France");
		map.put(4, "Japan");
		System.out.println("Traversing a HashMap..");
		
		
//		for (Integer key : map.keySet()) {
//			System.out.println("Key : "+key+" Value : "+map.get(key));
//		}
		
		
//		Set<Integer> keySet = map.keySet();
//		Iterator<Integer> itr  = keySet.iterator();
//		while(itr.hasNext()) {
//			Integer key = itr.next();
//			System.out.println("Key : "+key+" Value : "+map.get(key));
//		}
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		for (Map.Entry entry : set) {
			System.out.println("Key : "+entry.getKey()+ " Value : "+entry.getValue() );
		}
		
	}

}
