package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapKey {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Map<String, Integer> contacts = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// putting contacts into the array.
			contacts.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Check if key exists print the contact, if it doesn't exist, print Not found.
			if(contacts.containsKey(s)) {
				System.out.println(s + "=" + contacts.get(s));
			}else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}