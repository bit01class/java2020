package com.bit.day10;

public class Lotto1 {

	public static void main(String[] args) {
		System.out.println("로또번호생성기(ver 0.0.1)");
		//1~45
		//0~44   +1
		int[] lotto=new int[7];
		
		for(int i=0; i<lotto.length; i++){
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<0+i; j++){
				if(lotto[i]==lotto[j]){
					System.out.println("중복발생");
					i--;
					break;
				}
			}
		}
		int temp=0;
		for(int i=0; i<6-1; i++){
			for(int j=i+1; j<6; j++){
				if(lotto[i]>lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++){
			System.out.print(lotto[i]+" ");
		}

	}

}












