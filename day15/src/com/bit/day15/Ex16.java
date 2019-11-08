package com.bit.day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		List<Map<String,Integer>> data=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.3.0)";
		String bar="--------------------------------";
		String menu="1.입력 2.보기 3.수정 4.삭제 0.종료>";
		String[] lec={"kor","eng","math"};
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
			if(su==1){
				Map<String,Integer> stu=new HashMap<>();
				stu.put("num", ++num);
				for(int i=0; i<lec.length; i++){
					System.out.print(lec[i]+">");
					input=sc.nextLine();
					stu.put(lec[i], Integer.parseInt(input));
				}
				data.add(stu);
			}
			else if(su==2){
				System.out.println(bar);
				System.out.println("학번\t|국어\t|영어\t|수학");
				System.out.println(bar);
				for(int i=0; i<data.size(); i++){
					Map<String, Integer> stu = data.get(i);
					System.out.print(stu.get("num"));
					System.out.print("\t|");
					System.out.print(stu.get("kor"));
					System.out.print("\t|");
					System.out.print(stu.get("eng"));
					System.out.print("\t|");
					System.out.println(stu.get("math"));
				}
			}
			else if(su==3){
				System.out.print("수정할 학번");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				for(int i=0; i<data.size(); i++){
					Map<String, Integer> temp;
					temp= data.get(i);
					if(su==temp.get("num")){
						Map<String,Integer> stu=new HashMap<>();
						stu.put("num", su);
						for(int j=0; j<lec.length; j++){
							System.out.print(lec[j]+">");
							input=sc.nextLine();
							stu.put(lec[j], Integer.parseInt(input));
							
						}
						data.set(i,stu);
						break;
					}
				}
			}
			else if(su==4){
				System.out.print("삭제할 학번");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				for(int i=0; i<data.size(); i++){
					Map<String, Integer> stu;
					stu= data.get(i);
					if(su==stu.get("num")){
						data.remove(i);
					}
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}
