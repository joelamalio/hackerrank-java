package br.com.joelamalio.hackerrank.java.advanced.javamd5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(s.getBytes(), 0, s.length());
			System.out.println(new BigInteger(1, md.digest()).toString(16));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
