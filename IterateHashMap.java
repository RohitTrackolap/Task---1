package com.basicExample;

import java.util.HashMap;
import java.util.Iterator;

public class IterateHashMap {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("10","Rohit");
		hashMap.put("15","Rahul");
		hashMap.put("21","Rohan");
		Iterator<String, String> itr = hashMap.entrySet().iterator();
	}
}
