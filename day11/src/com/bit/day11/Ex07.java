package com.bit.day11;

import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) {
		String target="java DB             web Spring android";
		
		java.util.StringTokenizer stk;
		stk=new java.util.StringTokenizer(target);
		
		int cnt=stk.countTokens();
		System.out.println("¸î°³:"+cnt);
		
		while(stk.hasMoreElements()){
			System.out.println(stk.nextElement());
		}
	}

}
















