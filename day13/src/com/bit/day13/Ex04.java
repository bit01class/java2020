package com.bit.day13;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String bar="----------------------------------------";
		String table=bar+"\n학번\t|국어\t|영어\t|수학\n"+bar;
		String menu="1.입력 2.보기 3.수정 4.삭제 0.종료>";
		String title="학생성적관리프로그램(ver 0.1.1)";
		System.out.println(title);
		System.out.println(bar);
		String input=null;
		int num=0;
		System.out.print("총원>");
		input=sc.nextLine();
		int tot=Integer.parseInt(input);
		int[][] data =new int[tot][4];
//		int[][] data ={
//				{0,0,0,0},
//				{0,0,0,0},
//				{0,0,0,0}
//		};
//		int[][] data={};
		String[] inputMsg={"국어>","영어>","수학>"};
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){break;}
			else if(input.equals("1")){
				data[num][0]=num+1;
				for(int i=0; i<3; i++){
					System.out.print(inputMsg[i]);
					input=sc.nextLine();
					int su=Integer.parseInt(input);
					data[num][1+i]=su;
				}
				num++;
			}
			else if(input.equals("2")){
				System.out.println(table);
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					for(int j=0; j<stu.length; j++){
						if(j!=0){System.out.print("\t|");}
						System.out.print(stu[j]);
					}
					System.out.println();
				}
			}
			else if(input.equals("3")){
				System.out.print("수정할 학번:");
				input=sc.nextLine();
				int edit=Integer.parseInt(input);
				int[] stu=data[edit-1];
				stu[0]=edit;
				for(int i=1; i<stu.length; i++){
					System.out.print(inputMsg[i-1]);
					input=sc.nextLine();
					stu[i]=Integer.parseInt(input);
				}
			}
			else if(input.equals("4")){
				System.out.print("삭제할 학번:");
				input=sc.nextLine();
				int del=Integer.parseInt(input)-1;
				int[] stu=data[del];
				for(int i=0; i<stu.length; i++){
					stu[i]=0;
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}














