package com.bit.day11;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=null;
		int su=0;
		int[] target={1,4,6,12};
		System.out.print("숫자를 입력하세요");
		input=sc.nextLine();
		try{
			su=Integer.parseInt(input);
			System.out.println("입력하신수의 "
					+target[su]+"÷"+su+"="+(target[su]/su));
		}catch(NumberFormatException e){
			System.out.println("문자입력으로 입력오류");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열없음");
		}catch(ArithmeticException e){
			System.out.println("0 으로는 나누지 못함");
		}
	}

}







