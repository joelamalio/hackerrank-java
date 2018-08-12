package br.com.joelamalio.hackerrank.java.datastructures.phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			phoneBook.put(name, phone);
		}
		
		while (in.hasNext()) {
			String s = in.nextLine();
			Integer phone = phoneBook.get(s);
			
			if (phone == null) {
				System.out.println("Not found");
			} else {
				System.out.println(String.format("%s=%d", s, phone));
			}
		}
		
		in.close();
	}

}
