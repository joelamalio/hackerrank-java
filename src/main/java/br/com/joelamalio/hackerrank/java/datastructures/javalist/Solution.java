package br.com.joelamalio.hackerrank.java.datastructures.javalist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		
		n = scan.nextInt();
		
		String query;
		int x, y;
		for (int i = 0; i < n; i++) {
			query = scan.next();
			x = scan.nextInt();
			if ("Insert".equalsIgnoreCase(query)) {
				y = scan.nextInt();
				list.add(x, y);
			} else if ("Delete".equalsIgnoreCase(query)) {
				list.remove(x);
			}
		}
		
		scan.close();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
    }
	
}
