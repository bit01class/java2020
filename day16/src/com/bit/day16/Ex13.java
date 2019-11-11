package com.bit.day16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc=null;
		gc=new GregorianCalendar(2002,4,1,12,0,0);
		
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.HOUR));
		System.out.println(gc.get(Calendar.MINUTE));
		System.out.println(gc.get(Calendar.SECOND));
	}

}














