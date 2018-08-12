package br.com.joelamalio.hackerrank.java.strings.tagcontentextractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		// retrieve the text => (?<=)[\w\s]*(?=<)
		// retrieve the tags => (<\/?[\w\s]*>)
		final String regex = "<(.+)>([^<]+)</\\1>";
		final Pattern pattern = Pattern.compile(regex);
		Matcher matcher;
		
		while (testCases > 0) {
			String line = in.nextLine();
			
			boolean matchFound = false;
			matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            
            if (!matchFound) {
                System.out.println("None");
            }
            testCases--;
		}
	}
}
