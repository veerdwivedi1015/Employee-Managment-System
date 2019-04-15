package com.vikas.jdbc.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Dateutilities {

	public static java.util.Date acceptDate() {
		java.util.Date dt = null;
		Scanner in = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String s = in.nextLine();
		try {
			dt = df.parse(s);
			
		}catch(ParseException pe) {
			System.out.println("Invalid format");
		}
		return dt;
	}
	
	public static java.util.Date convertDate(String Date) {
		java.util.Date dt = null;
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		try {
			dt = df.parse(Date);
		}catch(ParseException pe) {
			System.out.println("Invalid Format");
		}
		return dt;
	}
	
	public static java.util.Date convertTime(String Time) {
		java.util.Date dt = null;
		SimpleDateFormat df =  new SimpleDateFormat("hh:mm:ss");
		try {
			dt = df.parse(Time);
		}catch(ParseException pe) {
			System.out.println("Invalid Format");
		}
		return dt;
	}
	
	public static java.util.Date convertDateAndTime(String date) {
		java.util.Date dt = null;
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		try {
			dt = df.parse(date);
		} catch (ParseException e) {
			System.out.println("invalid format");
		}
		return dt;
	}
	
}
