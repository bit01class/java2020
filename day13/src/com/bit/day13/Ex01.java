package com.bit.day13;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		String data="";
		//\n1\t|11\t|22\t|33
		//\n2\t|22\t|24\t|35
		//\n3\t|72\t|84\t|95
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
				data+=rowString(num,sc);
			}
			else if(input.equals("2")){
				System.out.print(table);
				System.out.println(data);
			}
			else if(input.equals("3")){
				data=myReplace("������ �й�>",data,sc);
			}
			else if(input.equals("4")){
				data=myReplace("������ �й�>",data,"",sc);
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	public static String myReplace(String msg,String data,Scanner sc){
		int enter=inputScan(msg,sc)+1;
		String input="\n"+(enter-1)+"\t|";
		int start=data.indexOf(input);
		int end=data.indexOf('\n',start+1);
		String target=null;
		try{
			target=data.substring(start,end);
		}catch(StringIndexOutOfBoundsException e){
			target=data.substring(start);
		}
		String replacement=rowString(enter-1,sc);
		return data.replace(target, replacement);
	}
	public static String myReplace(String msg,String data,String replacement,Scanner sc){
		int enter=inputScan(msg,sc)+1;
		String input="\n"+(enter-1)+"\t|";
		int start=data.indexOf(input);
		int end=data.indexOf('\n',start+1);
		String target=null;
		try{
			target=data.substring(start,end);
		}catch(StringIndexOutOfBoundsException e){
			target=data.substring(start);
		}
		return data.replace(target, replacement);
	}
	
	public static String rowString(int num,Scanner sc){
		int kor=inputScan("����>",sc);
		int eng=inputScan("����>",sc);
		int math=inputScan("����>",sc);
		return "\n"+num+"\t|"+kor+"\t|"+eng+"\t|"+math;
	}
	
	public static int inputScan(String msg,Scanner sc){
		return inputScan(0,100,msg,sc);
	}
	public static int inputScan(int start,int end,String msg,Scanner sc){
		int num=-1;
		while(true){
			System.out.print(msg);
			String input=sc.nextLine();
			num=Integer.parseInt(input);
			if(num>=start&&num<=end){break;}
		}
		return num;
	}
}

















