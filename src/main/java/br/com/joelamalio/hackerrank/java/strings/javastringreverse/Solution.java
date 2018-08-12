package br.com.joelamalio.hackerrank.java.strings.javastringreverse;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		char[] array = A.toCharArray();
		int len = array.length;
		boolean isPalindrome = true;
		
		for (int i = 0; i < len; i++) {
			if (array[i] != array[len - 1 - i]) {
				isPalindrome = false; 
				break;
			}
		}

		System.out.println(isPalindrome ? "Yes" : "No");
	}
}
