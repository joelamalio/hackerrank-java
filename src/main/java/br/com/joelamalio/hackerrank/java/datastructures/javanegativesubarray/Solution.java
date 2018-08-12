package br.com.joelamalio.hackerrank.java.datastructures.javanegativesubarray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
		int amount = 0;
		
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += array[j]; 
				if (sum < 0) {
					amount++;
				}
			}
		}
		
		System.out.println(amount);
    }
	
}
