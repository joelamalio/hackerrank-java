package br.com.joelamalio.hackerrank.java.strings.javastringtokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String[] tokens = s.trim().split("[^a-zA-Z]+");
		List<String> list = new ArrayList<String>(Arrays.asList(tokens));
		list.removeAll(Arrays.asList(""));
		
		System.out.println(list.size());
		for (String token : list) {
			System.out.println(token);
		}
		
		scan.close();
	}
}
