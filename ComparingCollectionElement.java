package com.basicExample;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ComparingCollectionElement {
	public static void main(String[] args) {
		String[] city = { "Noida", "Ghaziabad", "Bangalore", "Kanpur", "Aligarh" };
		Set<String> set = new HashSet<>();
		for (int i = 0; i < city.length; i++)
			set.add(city[i]);
		System.out.println(Collections.min(set));
		System.out.println(Collections.max(set));

	}
}
