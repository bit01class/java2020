package com.bit.day15;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title="�л������������α׷�(ver 0.3.0)";
		String bar="--------------------------------";
		String menu="1.�Է� 2.���� 3.���� 4.���� 0.����>";
		String[] lec={"����","����","����"};
		String input=null;
		int su=-1;
		int cnt=3;
		int num=19000;
		
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			su=Integer.parseInt(input);
			if(su==0){break;}
			if(su==1){}
			else if(su==2){}
			else if(su==3){}
			else if(su==4){}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}
