package br.com.joelamalio.hackerrank.java.datastructures.java2darray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int sum;
		int largestSum = Integer.MIN_VALUE;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				sum = sumFields(arr, i, j);
				if (sum > largestSum) {
					largestSum = sum;
				}
			}

		}

		System.out.println(largestSum);

	}
	
	/*
	 *	[i][j]		[i][j+1] 	[i][j+2]
	 *  			[i+1][j+1]
	 *  [i+2][j]		[i+2][j+1]	[i+2][j+2]		
	 */
	private static int sumFields(int arr[][], int i, int j) {
		int sum = Integer.MIN_VALUE;

		if ((i + 2 < 6) && (j + 2 < 6)) {
			sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
			sum += arr[i + 1][j + 1];
			sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
		}

		return sum;
	}
	
}
