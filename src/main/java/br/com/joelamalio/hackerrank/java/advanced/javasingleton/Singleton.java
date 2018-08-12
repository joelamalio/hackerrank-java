package br.com.joelamalio.hackerrank.java.advanced.javasingleton;

import java.util.Scanner;

public class Singleton {

	private static Singleton instance;
	public String str;
	
	private Singleton() {
	}
	
	public static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
