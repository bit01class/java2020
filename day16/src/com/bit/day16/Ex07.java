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
		data=new StringBuilder(bar+"\n����\t|����\t|����\n"+bar+"\n");
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
		System.out.println("�̿����ּż� �����մϴ�");
	}

}













