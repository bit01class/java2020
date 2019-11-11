package com.bit.day16;

import java.util.Calendar;

public class Ex12 {

	public static void main(String[] args) {
		Calendar begin=Calendar.getInstance();
		begin.set(2019, 10-1, 21);
		Calendar now=Calendar.getInstance();
		int nowDay=now.get(Calendar.DAY_OF_YEAR);
		int nowWEEK=now.get(Calendar.WEEK_OF_YEAR);
		int beginDay=begin.get(Calendar.DAY_OF_YEAR);
		int beginWEEK=begin.get(Calendar.WEEK_OF_YEAR);
		System.out.println(nowDay);
		System.out.println(beginDay);
		System.out.print(nowWEEK-beginWEEK+1+"주차 ");
		System.out.println(nowDay-beginDay+1+"일째");

	}

}
