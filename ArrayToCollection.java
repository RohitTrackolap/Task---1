package com.basicExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No of elements you want to enter ");
		int n = Integer.parseInt(bufferReader.readLine());
		System.out.println("Enter elements");
		String[] string = new String[n];
		for (int i = 0; i < n; i++) {
			string[i] = bufferReader.readLine();
		}
		List<String> listString = Arrays.asList(string);
		for (String str : listString) {
			String s = str;
			System.out.print(s + " ");
		}

	}

}
