package br.com.joelamalio.hackerrank.java.introduction.javadateandtime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
	public static String getDay(String day, String month, String year) {
		try {
			Calendar calendar = Calendar.getInstance();
			DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
			Date date = df.parse(String.format("%s-%s-%s", month, day, year));
			calendar.setTime(date);
			return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
		} catch (ParseException e) {
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));
	}
}
