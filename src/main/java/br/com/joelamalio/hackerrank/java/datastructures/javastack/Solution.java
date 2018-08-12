package br.com.joelamalio.hackerrank.java.datastructures.javastack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			
			if (input.length() % 2 != 0) {
				System.out.println(false);
			} else {
				Stack stack = new Stack();
				char[] array = input.toCharArray();
				String s;
				for (int i = 0; i < array.length; i++) {
					s = String.valueOf(array[i]);
					if (stack.isEmpty() || "(".equals(s) || "{".equals(s) || "[".equals(s)) {
						stack.push(s);
					} else if (("(".equals(stack.peek()) && ")".equals(s))
							|| ("{".equals(stack.peek()) && "}".equals(s))
							|| ("[".equals(stack.peek()) && "]".equals(s))) {
						stack.pop();
					} else {
						break;
					}
				}
				
				System.out.println(stack.isEmpty());
			}
			
		}
		
		sc.close();

	}

}
