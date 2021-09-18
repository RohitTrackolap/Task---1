package com.basicExample;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(16);
		list.add(24);
		list.add(36);
		list.add(45);
		list.add(11);
		Object[] array = list.toArray();
		for (Object obj : array)
			System.out.println(obj);

	}
}
