package com.bit.day16;

public class Ex06 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("java");
		StringBuilder sb2=new StringBuilder("java");
		StringBuilder sb3=new StringBuilder("java");
		StringBuilder sb4=new StringBuilder("java");
		StringBuilder sb5=new StringBuilder("java");
		char[] chs={'A','B','C','D','E','F','G'};
		String st2="ABCDEFG";
		sb1.append(chs,2,4);
		System.out.println(sb1);
		sb2.append(st2,2,6);
		System.out.println(sb2);
		sb3.getChars(1, 3, chs, 2);
		for(int i=0; i<chs.length; i++){
			System.out.println(chs[i]);
		}
		sb4.insert(2, "ADD");
		System.out.println(sb4);
		sb5.replace(1, 3, "AV");
		System.out.println(sb5);
	}		

}













