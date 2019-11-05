package com.bit.day11;

public class Ex11 {

	public static void main(String[] args) {
		System.out.println("main start...");
		try{
			func(10,0);
		}catch(ArithmeticException e){
			System.out.println("회피...");
		}
		System.out.println("main end...");
	}
	public static void func(int a,int b) throws ArithmeticException{
//		try{
		int c=a/b;
		System.out.println(a+"÷"+b+"="+c);
//		}catch(ArithmeticException e){
//			System.out.println("회피...");
//		}
	}
}
