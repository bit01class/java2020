package com.bit.day10;

public class Lotto2 {

	public static void main(String[] args) {
		System.out.println("로또번호생성기(ver 0.0.2)");
		int[] lotto=new int[45];
		for(int i=0; i<lotto.length; i++){
			lotto[i]=i+1;
		}
		
		int temp=0;
		for(int i=0; i<100000; i++){
			int ran=(int)(Math.random()*45);
			temp=lotto[ran];
			lotto[ran]=lotto[0];
			lotto[0]=temp;
		}
		
		for(int i=0; i<6; i++){
			System.out.print(lotto[i]+" ");
		}

	}

}













