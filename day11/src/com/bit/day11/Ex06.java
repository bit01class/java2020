package com.bit.day11;

public class Ex06 {

	public static void main(String[] args) {
		String target="java DB             web Spring android";

		String[] data=target.split(" ");
		System.out.println("±Ê¿Ã:"+data.length);
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}
	}

}
