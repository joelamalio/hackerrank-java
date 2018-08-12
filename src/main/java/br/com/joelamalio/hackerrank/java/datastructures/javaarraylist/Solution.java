package br.com.joelamalio.hackerrank.java.datastructures.javaarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		int[] array;
		
		for (int i = 0; i < n; i++) {
			int length = scan.nextInt();
			array = new int[length];
			for (int j = 0; j < length; j++) {
				array[j] = scan.nextInt();
			}
			list.add(array);
		}
		
		n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			try {
				System.out.println(list.get(x-1)[y-1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
		
		scan.close();
	}
}
