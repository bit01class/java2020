package com.bit.day15;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.3.0)";
		String bar="--------------------------------";
		String menu="1.입력 2.보기 3.수정 4.삭제 0.종료>";
		String[] lec={"국어","영어","수학"};
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
		System.out.println("이용해주셔서 감사합니다");
	}

}
