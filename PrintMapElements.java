package com.basicExample;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintMapElements {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Rohit");
		map.put(2, "Kalash");
		map.put(3, "Sumit");
		map.put(4, "Krishna");
		Iterator<Map.Entry<Integer, String>> entry = map.entrySet().iterator();
		while (entry.hasNext())
			System.out.println(entry.next());
		System.out.println("Using forEach loop");
		for (Map.Entry<Integer, String> mapEntry : map.entrySet()) {
			System.out.println("Key -" + mapEntry.getKey() + " Value -" + mapEntry.getValue());
		}

	}
}
