package com.bit.day16;

import java.util.Calendar;

public class Ex11 {

	public static void main(String[] args) {
		// ��¥�ð�
		char[] ch={'��','��','ȭ','��','��','��','��'};
		Calendar cal=Calendar.getInstance();
		
		cal.set(2002,4,1,0,0);
		
		System.out.print(cal.get(cal.YEAR)+"��");
		System.out.print(cal.get(cal.MONTH)+1+"��");// 0~11
		System.out.print(cal.get(cal.DATE)+"��");
		System.out.print(ch[cal.get(cal.DAY_OF_WEEK)-1]+"����");
		System.out.print("\t");
		if(cal.get(cal.AM_PM)==0){
			System.out.print("a.m. ");
			System.out.print(cal.get(cal.HOUR)+"��");
		}else{//am=0 pm=1
			System.out.print("p.m. ");
			System.out.print(cal.get(cal.HOUR)+"��");
		}
		System.out.print(cal.get(cal.HOUR_OF_DAY)+"��");
		System.out.print(cal.get(cal.MINUTE)+"��");
		System.out.println(cal.get(cal.SECOND)+"��");
		System.out.println(365-cal.get(cal.DAY_OF_YEAR)+"��°");
		System.out.println(cal.get(cal.WEEK_OF_MONTH)+"����");
		System.out.println(cal.get(cal.WEEK_OF_YEAR)+"����");
		System.out.println(cal.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
	}

}







