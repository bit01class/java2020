package com.bit.day16;

public class Ex01 {

	public static void main(String[] args) {
		String msg0="java"+"web";
		String msg1="java".concat("web");
		StringBuffer msg2=new StringBuffer("BUFFER");
//		StringBuffer msg3="buffer class";
		
		StringBuffer msg3=new StringBuffer(" class");
		StringBuffer msg4=new StringBuffer("ÀÇ +");
		System.out.println(msg0=="javaweb");
		System.out.println(msg1=="javaweb");
		System.out.println("-------------------------------");
		System.out.println(msg2.append(msg3).append(msg4));
		System.out.println("-------------------------------");
		System.out.println(msg2);
	}

}













