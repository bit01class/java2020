package com.bit.day15;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ex15 {

	public static void main(String[] args) {
		Map<Integer,int[]> data=new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		String title="�л������������α׷�(ver 0.3.0)";
		String bar="--------------------------------";
		String menu="1.�Է� 2.���� 3.���� 4.���� 0.����>";
		String[] lec={"����","����","����"};
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
				int[] stu=new int[3];
				for(int i=0; i<lec.length; i++){
					System.out.print(lec[i]+">");
					input=sc.nextLine();
					stu[i]=Integer.parseInt(input);
				}
				data.put(++num, stu);
			}
			if(su==2){
				System.out.println(bar);
				System.out.println("�й�\t|����\t|����\t|����");
				System.out.println(bar);
				Set<Integer> nums = data.keySet();
				Iterator<Integer> ite = nums.iterator();
				while(ite.hasNext()){
					int key=ite.next();
					System.out.print(key);
					System.out.print("\t|");
					int[] val=data.get(key);
					System.out.print(val[0]);
					System.out.print("\t|");
					System.out.print(val[1]);
					System.out.print("\t|");
					System.out.println(val[2]);					
				}
			}
			if(su==3){
				System.out.print("������ �й�>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				int[] stu=new int[3];
				for(int i=0; i<lec.length; i++){
					System.out.print(lec[i]+">");
					input=sc.nextLine();
					stu[i]=Integer.parseInt(input);
				}
				data.put(su, stu);
			}
			if(su==4){
				System.out.print("������ �й�>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.remove(su);
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}


