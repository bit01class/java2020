package com.bit.day11;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=null;
		int su=0;
		int[] target={1,4,6,12};
		System.out.print("���ڸ� �Է��ϼ���");
		input=sc.nextLine();
		try{
			su=Integer.parseInt(input);
			System.out.println("�Է��Ͻż��� "
					+target[su]+"��"+su+"="+(target[su]/su));
		}catch(NumberFormatException e){
			System.out.println("�����Է����� �Է¿���");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭����");
		}catch(ArithmeticException e){
			System.out.println("0 ���δ� ������ ����");
		}
	}

}







