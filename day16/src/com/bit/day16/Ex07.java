package com.bit.day16;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 성적관리프로그램(ver 0.4.0)
		// use StringBuffer Class
		// 1.입력 2.보기 3.수정 4.삭제 0.종료>
		Scanner sc=new Scanner(System.in);
		String menu="1.입력 2.보기 3.수정 4.삭제 0.종료>";
		String bar="-------------------------------";
		System.out.println("성적관리프로그램(ver 0.4.0)");
		System.out.println(bar);
		String input=null;
		String[] msgs={"학번","국어","영어","수학"};
		StringBuilder data=null;
		data=new StringBuilder(bar+"\n국어\t|영어\t|수학\n"+bar+"\n");
		int num=0;
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				data.append(++num);
				
				for(int i=1; i<msgs.length; i++){
					System.out.print(msgs[i]);
					input=sc.nextLine();
					data.append("\t|");
					data.append(input);
				}
				
				data.append("\n");
				
			}else if(input.equals("2")){
				System.out.println(data);
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}













