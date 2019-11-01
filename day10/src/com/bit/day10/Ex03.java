package com.bit.day10;

public class Ex03 {

	public static void main(String[] args) {
		// Double
		Double su1;
		su1=new Double("3");
		System.out.println(su1);
		
		Double su2=2.0/0.0;
		Double su3=0.0/0.0;
		
		System.out.println(su2.isInfinite());
		System.out.println(su2.isNaN());
		System.out.println(su3.isInfinite());
		System.out.println(su3.isNaN());
	}

}
