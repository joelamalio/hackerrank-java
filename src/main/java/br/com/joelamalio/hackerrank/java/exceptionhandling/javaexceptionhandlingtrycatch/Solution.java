package br.com.joelamalio.hackerrank.java.exceptionhandling.javaexceptionhandlingtrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        try {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException ime) {
        	System.out.println("java.util.InputMismatchException");
	    } catch (ArithmeticException ae) {
	    	System.out.println("java.lang.ArithmeticException: / by zero");
	    }
    }
}
