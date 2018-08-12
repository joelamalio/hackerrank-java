package br.com.joelamalio.hackerrank.java.introduction.javaendoffile;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String line;
		while (true) {
			try {
				line = sc.nextLine();
			} catch (NoSuchElementException nsee) {
				break;
			}
			if (line.isEmpty()) {
				break;
			}
			System.out.println(++n + " " + line);
		}
		
	}
}
