package com.bit.day16;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// �����������α׷�(ver 0.4.0)
		// use StringBuffer Class
		// 1.�Է� 2.���� 3.���� 4.���� 0.����>
		Scanner sc=new Scanner(System.in);
		String menu="1.�Է� 2.���� 3.���� 4.���� 0.����>";
		String bar="-------------------------------";
		System.out.println("�����������α׷�(ver 0.4.0)");
		System.out.println(bar);
		String input=null;
		String[] msgs={"�й�","����","����","����"};
		StringBuilder data=null;
		data=new StringBuilder(bar+"\n�й�\t|����\t|����\t|����\n"+bar+"\n");
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
			}else if(input.equals("3")){
				System.out.print("������ �й�>");
				input=sc.nextLine();
				int idx=data.indexOf("\n"+input+"\t|");
				int end=data.indexOf("\n", idx+1);
				String str="\n"+input;
				for(int i=1; i<msgs.length; i++){
					System.out.print(msgs[i]);
					input=sc.nextLine();
					str+="\t|"+input;
				}
				data.replace(idx, end, str);
				
			}else if(input.equals("4")){
				System.out.print("������ �й�>");
				input=sc.nextLine();
				int idx=data.indexOf("\n"+input+"\t|");
				int end=data.indexOf("\n", idx+1);
				data.delete(idx, end);
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}













