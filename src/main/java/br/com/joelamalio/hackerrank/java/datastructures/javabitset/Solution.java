package br.com.joelamalio.hackerrank.java.datastructures.javabitset;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int value1, value2;
		String operation;
		Map<Integer, BitSet> map = new HashMap<Integer, BitSet>();
		final int B1 = 1;
		final int B2 = 2;
		map.put(B1, new BitSet(n));
		map.put(B2, new BitSet(n));
		
		for (int i = 0; i < m; i++) {
			operation = scan.next();
			value1 = scan.nextInt();
			value2 = scan.nextInt();
			
			if ("AND".equals(operation)) {
				map.get(value1).and(map.get(value2));
			} else if ("SET".equals(operation)) {
				map.get(value1).set(value2);
			} else if ("FLIP".equals(operation)) {
				map.get(value1).flip(value2);
			} else if ("OR".equals(operation)) {
				map.get(value1).or(map.get(value2));
			} else if ("XOR".equals(operation)) {
				map.get(value1).xor(map.get(value2));
			}
			
			System.out.println(map.get(B1).cardinality() + " " + map.get(B2).cardinality());
		}
		
		
		scan.close();
    }
	
}
