package com.bit.day16;

import java.util.Calendar;

public class Ex11 {

	public static void main(String[] args) {
		// 날짜시간
		char[] ch={'일','월','화','수','목','금','토'};
		Calendar cal=Calendar.getInstance();
		
		cal.set(2002,4,1,0,0);
		
		System.out.print(cal.get(cal.YEAR)+"년");
		System.out.print(cal.get(cal.MONTH)+1+"월");// 0~11
		System.out.print(cal.get(cal.DATE)+"일");
		System.out.print(ch[cal.get(cal.DAY_OF_WEEK)-1]+"요일");
		System.out.print("\t");
		if(cal.get(cal.AM_PM)==0){
			System.out.print("a.m. ");
			System.out.print(cal.get(cal.HOUR)+"시");
		}else{//am=0 pm=1
			System.out.print("p.m. ");
			System.out.print(cal.get(cal.HOUR)+"시");
		}
		System.out.print(cal.get(cal.HOUR_OF_DAY)+"시");
		System.out.print(cal.get(cal.MINUTE)+"분");
		System.out.println(cal.get(cal.SECOND)+"초");
		System.out.println(365-cal.get(cal.DAY_OF_YEAR)+"일째");
		System.out.println(cal.get(cal.WEEK_OF_MONTH)+"주차");
		System.out.println(cal.get(cal.WEEK_OF_YEAR)+"주차");
		System.out.println(cal.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
	}

}







