package com.bit.day16;

import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		java.util.Random ran=new Random();
		
		
		System.out.println(ran);
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt(45)+1); //0~매개변수-1
		System.out.println(ran.nextInt(45)+1); //0~매개변수-1
		System.out.println(ran.nextInt(45)+1); //0~매개변수-1
		System.out.println(ran.nextInt(45)+1); //0~매개변수-1
		System.out.println(ran.nextDouble());
		
	}

}
