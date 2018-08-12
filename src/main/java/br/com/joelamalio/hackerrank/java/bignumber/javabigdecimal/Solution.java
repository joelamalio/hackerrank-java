package br.com.joelamalio.hackerrank.java.bignumber.javabigdecimal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1 != null && s2 != null) {
					Double d1 = Double.valueOf(s1);
					Double d2 = Double.valueOf(s2);
					return d2.compareTo(d1);
				}
				return 0;
			}
			
		});

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
