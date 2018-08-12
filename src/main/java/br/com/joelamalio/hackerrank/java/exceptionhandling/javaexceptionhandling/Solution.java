package br.com.joelamalio.hackerrank.java.exceptionhandling.javaexceptionhandling;

import java.util.Scanner;

public class Solution {
	
	public static long power(int n, int p) throws Exception {
		if (n == 0 && p == 0) throw new Exception("n and p should not be zero.");
		if (n < 0 || p < 0) throw new Exception("n or p should not be negative.");
		
		return (long) Math.pow(n, p);
	}
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int p = sc.nextInt();
    	
    	try {
    		System.out.println(power(n, p));
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    }  

}
