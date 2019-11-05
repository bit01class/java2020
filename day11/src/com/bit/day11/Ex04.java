package com.bit.day11;

public class Ex04 {

	public static void main(String[] args) {
		// java
		String target="java";
		
		String result=null;
//		result=target.replace('v', 'V');
		result=target.replace("av", "aWebv");
		
		System.out.println(target==result);
		System.out.println(result);
		System.out.println(target);
		System.out.println(target.contains("av"));
		System.out.println(target.contains("aV"));
		System.out.println(target.startsWith("j"));
		System.out.println(target.endsWith("a"));
		System.out.println(target.indexOf('a'));
		System.out.println(target.indexOf("av"));
		System.out.println(target.lastIndexOf('a'));
		System.out.println(target.lastIndexOf("av"));
		target="JavaWebSpring";
		//      01234
		//		1234567
		String result2=target.substring(4,7);
		System.out.println(result2);
		System.out.println(target.toLowerCase());
		System.out.println(target.toUpperCase());
		System.out.println(target.toString());
		System.out.println("------------------------");
		target="       \n       ab cd 	ef       ";
		// 앞,뒤 공백제거
		System.out.println(target.trim()+"여기까지");
	}

}










