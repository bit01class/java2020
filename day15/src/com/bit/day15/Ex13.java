package com.bit.day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		ArrayList<Integer> data =new ArrayList<>();
		// 학생성적관리프로그램(ver 0.3.0)
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.3.0)";
		String bar="--------------------------------";
		String menu="1.입력 2.보기 3.수정 4.삭제 0.종료>";
		String input=null;
		int su=-1;
		int cnt=3;
		int num=19000;
		
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		
		while(true){
			try{
			System.out.print(menu);
			input=sc.nextLine();
			su=Integer.parseInt(input);
			}catch(NumberFormatException e){
				if(cnt==0){break;}
				System.out.println("숫자를 입력하세요");
				cnt--;
				continue;
			}
			if(su==0){break;}
			else if(su==1){
				num++;
				data.add(num);
				System.out.print("국어>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.add(su);
				System.out.print("영어>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.add(su);
				System.out.print("수학>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.add(su);
			}
			else if(su==2){
				System.out.println(bar);
				System.out.println("학번\t|국어\t|영어\t|수학");
				System.out.println(bar);
				for(int i=0; i<data.size(); i+=4){
					System.out.print(data.get(i));
					System.out.print("\t|");
					System.out.print(data.get(i+1));
					System.out.print("\t|");
					System.out.print(data.get(i+2));
					System.out.print("\t|");
					System.out.println(data.get(i+3));
				}
//				for(int i=0; i<data.size(); i++){
//					System.out.print(data.get(i++));
//					System.out.print("\t|");
//					System.out.print(data.get(i++));
//					System.out.print("\t|");
//					System.out.print(data.get(i++));
//					System.out.print("\t|");
//					System.out.println(data.get(i));
//				}
				
			}
			else if(su==3){
				System.out.print("수정할 학번>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				int idx=data.indexOf(su);
				System.out.print("국어>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.remove(idx+1);
				data.add(idx+1,su);
				System.out.print("영어>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.remove(idx+2);
				data.add(idx+2,su);
				System.out.print("수학>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.remove(idx+3);
				data.add(idx+3,su);
			}
			else if(su==4){
				System.out.println("삭제할 학번>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				int idx=data.indexOf(su);
				data.remove(idx);
				data.remove(idx);
				data.remove(idx);
				data.remove(idx);
			}
			else {
				if(cnt==0){break;}
				cnt--;
				System.out.println("메뉴를 보고 0~4사이의 값을 입력하세요");
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}

















