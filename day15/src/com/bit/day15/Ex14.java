package com.bit.day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		ArrayList<int[]> data =new ArrayList<>();
		// �л������������α׷�(ver 0.3.0)
		Scanner sc=new Scanner(System.in);
		String title="�л������������α׷�(ver 0.3.0)";
		String bar="--------------------------------";
		String menu="1.�Է� 2.���� 3.���� 4.���� 0.����>";
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
				System.out.println("���ڸ� �Է��ϼ���");
				cnt--;
				continue;
			}
			if(su==0){
				break;
			}else if(su==1){
				int[] stu=new int[4];
				stu[0]=++num;
				System.out.print("����>");
				input=sc.nextLine();
				stu[1]=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				stu[2]=Integer.parseInt(input);
				System.out.print("����");
				input=sc.nextLine();
				stu[3]=Integer.parseInt(input);
				data.add(stu);
			}else if(su==2){
				System.out.println(bar);
				System.out.println("�й�\t|����\t|����\t|����");
				System.out.println(bar);
				for(int i=0; i<data.size(); i++){
					int[] stu = data.get(i);
					System.out.println(stu[0]+"\t|"
							+stu[1]+"\t|"+stu[2]+"\t|"+stu[3]);
				}
			}else if(su==3){
				System.out.print("������ �й�>");
				input=sc.nextLine();
				int temp=Integer.parseInt(input);
				int idx=-1;
				for(int i=0; i<data.size(); i++){
					if(data.get(i)[0]==temp){idx=i;}
				}
				data.remove(idx);
				int[] stu=new int[4];
				stu[0]=temp;
				System.out.print("����>");
				input=sc.nextLine();
				stu[1]=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				stu[2]=Integer.parseInt(input);
				System.out.print("����");
				input=sc.nextLine();
				stu[3]=Integer.parseInt(input);
			
				data.add(idx,stu);
			
			}else if(su==4){
				System.out.print("������ �й�>");
				input=sc.nextLine();
				int temp=Integer.parseInt(input);
				int idx=-1;
				for(int i=0; i<data.size(); i++){
					if(data.get(i)[0]==temp){idx=i;}
				}
				data.remove(idx);
			}else {
				if(cnt==0){break;}
				cnt--;
				System.out.println("�޴��� ���� 0~4������ ���� �Է��ϼ���");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}

















