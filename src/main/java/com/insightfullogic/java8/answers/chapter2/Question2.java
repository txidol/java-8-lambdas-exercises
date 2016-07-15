package com.insightfullogic.java8.answers.chapter2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class Question2 {

     public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

     public static void main(String[] args) throws ParseException {
    	 System.out.println(formatter.get().valueToString(new Date()));
	}
}
