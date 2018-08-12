package br.com.joelamalio.hackerrank.java.datastructures.javadequeue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque1 = new ArrayDeque<Integer>();
		Deque<Integer> deque2 = new ArrayDeque<Integer>();
		int n = in.nextInt();
		int m = in.nextInt();
		int limit = (n > m ? m : m - 1);

		for (int i = 0; i < limit; i++) {
			int num = in.nextInt();
			deque2.add(num);
		}
		
		for (int i = limit; i < n; i++) {
			int num = in.nextInt();
			deque1.add(num);
		}
		
		Iterator<Integer> iterator = deque1.iterator();
		Set<Integer> set = new HashSet(Arrays.asList(deque2.toArray()));
		int maxLength = set.size();
		
		while (iterator.hasNext()) {
			if (deque2.size() < m) {
				int addValue = iterator.next();
				deque2.add(addValue);
				set.add(addValue);
			} else {
				deque2.remove();
			}
			
			if (set.size() > maxLength) {
				set = new HashSet(Arrays.asList(deque2.toArray()));
				if (set.size() > maxLength) {
					maxLength = set.size();
				}
			}
			
			if (maxLength == m) {
				break;
			}
		}
		
		in.close();
		
		System.out.println(maxLength);
	}
}
