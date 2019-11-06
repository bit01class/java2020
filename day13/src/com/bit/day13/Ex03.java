package com.bit.day13;

import java.util.Scanner;

public class Ex03 {

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
//		System.out.print("총원>");
//		input=sc.nextLine();
//		int tot=Integer.parseInt(input);
//		int[][] data=new int[tot][4];
		int[][] data={};
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){break;}
			else if(input.equals("1")){
				num++;
				System.out.print("국어>");
				input=sc.nextLine();
				int kor=Integer.parseInt(input);
				System.out.print("영어>");
				input=sc.nextLine();
				int eng=Integer.parseInt(input);
				System.out.print("수학>");
				input=sc.nextLine();
				int math=Integer.parseInt(input);
				int[] student={num,kor,eng,math};
				
				int[][] students=data;
				data=new int[data.length+1][4];
				// copy
				for(int i=0; i<students.length; i++){
					data[i]=students[i];
				}
				data[data.length-1]=student;
				
			}
			else if(input.equals("2")){
				System.out.println(table);
				for(int i=0; i<data.length; i++){
					for(int j=0; j<data[i].length; j++){
						System.out.print(data[i][j]+"	|");
					}
					System.out.println();
				}
			}
			else if(input.equals("3")){
				System.out.print("수정할 학생학번>");
				input=sc.nextLine();
				int edit=Integer.parseInt(input);
				System.out.print("국어>");
				input=sc.nextLine();
				int kor=Integer.parseInt(input);
				System.out.print("영어>");
				input=sc.nextLine();
				int eng=Integer.parseInt(input);
				System.out.print("수학>");
				input=sc.nextLine();
				int math=Integer.parseInt(input);
				int[] student={edit,kor,eng,math};
				data[edit-1]=student;
			}
			else if(input.equals("4")){
				System.out.print("삭제할 학생학번>");
				input=sc.nextLine();
				int del=Integer.parseInt(input);
//				int idx=-1;
//				for(int i=0; i<data.length; i++){
//					if(del==data[i][0]){idx=i;}
//				}
//				data[idx]=new int[4];
				data[del-1]=new int[4];
				
			}
			else{}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}

















