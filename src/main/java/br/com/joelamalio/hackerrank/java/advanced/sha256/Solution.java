package br.com.joelamalio.hackerrank.java.advanced.sha256;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(s.getBytes(), 0, s.length());
			String hashtext = new BigInteger(1, md.digest()).toString(16);
			while(hashtext.length() < 64 ){
			  hashtext = "0" + hashtext;
			}
			System.out.println(hashtext);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
