package com.bit.day13;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String data="";
		//\n1\t|11\t|22\t|33
		//\n2\t|22\t|24\t|35
		//\n3\t|72\t|84\t|95
		//////////////////////////////
		//1\t|11\t|22\t|33
		//2\t|22\t|24\t|35
		//3\t|72\t|84\t|95
		Scanner sc=new Scanner(System.in);
		String bar="----------------------------------------";
		String table=bar+"\n�й�\t|����\t|����\t|����\n"+bar;
		String menu="1.�Է� 2.���� 3.���� 4.���� 0.����>";
		String title="�л������������α׷�(ver 0.1.0)";
		System.out.println(title);
		System.out.println(bar);
		String input=null;
		int num=0;
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){break;}
			else if(input.equals("1")){
				num++;
				System.out.println(num+"�й��������Է�");
				System.out.print("����>");
				input=sc.nextLine();
				int kor=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				int eng=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				int math=Integer.parseInt(input);
				data+="\n"+num+"\t|"+kor+"\t|"+eng+"\t|"+math;
			}
			else if(input.equals("2")){
				System.out.print(table);
				System.out.println(data);
			}
			else if(input.equals("3")){
				String[] rows=data.split("\n");
				System.out.print("������ �й�>");
				input=sc.nextLine();
				int delIdx=Integer.parseInt(input);
				data="";
				for(int i=0; i<rows.length; i++){
					if(delIdx==i){
						System.out.print("����>");
						input=sc.nextLine();
						int kor=Integer.parseInt(input);
						System.out.print("����>");
						input=sc.nextLine();
						int eng=Integer.parseInt(input);
						System.out.print("����>");
						input=sc.nextLine();
						int math=Integer.parseInt(input);
						data+="\n"+delIdx+"\t|"+kor
									+"\t|"+eng+"\t|"+math;;
					}else{
						data+="\n"+rows[i];
					}
				}
				data=data.replace("\n\n", "\n");
			}
			else if(input.equals("4")){
				
				String[] rows=data.split("\n");
				System.out.print("������ �й�>");
				input=sc.nextLine();
//				int delIdx=Integer.parseInt(input);
				int idx=-1;
				for(int i=0; i<rows.length; i++){
					if(rows[i].startsWith(input+"\t|")){
						System.out.println(i);
						idx=i;
					}
				}
				data="";
				for(int i=1; i<rows.length; i++){
					if(idx==i){continue;}
					data+="\n"+rows[i];
				}
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}

















