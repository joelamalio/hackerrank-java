package br.com.joelamalio.hackerrank.java.strings.javaanagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
	
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		char[] arrayA = a.toLowerCase().toCharArray();
		char[] arrayB = b.toLowerCase().toCharArray();
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		for (int i = 0; i < a.length(); i++) {
			if (arrayA[i] != arrayB[i]) {
				return false;
			}
		}
		
        return true;
    }
}
