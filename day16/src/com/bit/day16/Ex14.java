package com.bit.day16;

import java.util.Date;

public class Ex14 {

	public static void main(String[] args) {
		java.util.Date now=null;
		java.util.Date now2=null;
//		now=new Date(2002-1900,5-1,1,12,0);
		now2=new Date(System.currentTimeMillis()+(24L*60*60*1000*100));
		now=new Date("2002/01/01 12:00:00");
		//24*60*60*1000
		System.out.println(now.after(now2));
		System.out.println(now.before(now2));
		System.out.println(now2.compareTo(now));
//		System.out.println(Date.parse("Sat, 12 Aug 1995 13:30:00 GMT"));
		System.out.println(Date.parse("2002/01/01 12:00:00"));
		System.out.println(now.getYear()+1900+"년");
		System.out.println(now.getMonth()+1+"월");
		System.out.println(now.getDate()+"일");
		System.out.println(now.getDay()+"요일");
		System.out.println(now.getHours()+"시");
		System.out.println(now.getMinutes()+"분");
		System.out.println(now.getSeconds()+"초");

	}

}
