package com.bit.day11;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		int su=sc.nextInt();
		
		System.out.println(su);
		}catch(java.util.InputMismatchException e){
			System.out.println("È¸ÇÇ...");
		}

	}

}
