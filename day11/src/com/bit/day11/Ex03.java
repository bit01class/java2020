package com.bit.day11;

public class Ex03 {

	public static void main(String[] args) {
		// 문자열
		String st1="java";
		st1=new String("java");
		char[] ch1={'J','A','V','A'};
		st1=new String(ch1);
		byte[] by1={106,97,118,97};
		st1=new String(by1);
		st1=String.valueOf(ch1);
		System.out.println(st1);
		
		// 추가,삽입,수정,삭제
		
		String target1="java";
		String target2="web";
		
		String result=null;
		result=target1+target2;
		
		result=target1.concat(target2);
		// javweba
		char[] tar1=target1.toCharArray();
		char[] tar2=target2.toCharArray();
		char[] ch2=new char[tar1.length+tar2.length];
		int cnt=0;
		for(int i=0; i<3; i++){
			ch2[cnt]=tar1[i];
			cnt++;
		}
		for(int i=0; i<tar2.length; i++){
			ch2[cnt]=tar2[i];
			cnt++;
		}
		for(int i=3; i<tar1.length; i++){
			ch2[cnt]=tar1[i];
			cnt++;
		}
		
		char[] tar3=target1.toCharArray();
//		tar3[2]=(char)(tar3[2]-('a'-'A'));
		
		char[] tar4=new char[tar3.length-1];
		cnt=0;
		for(int i=0; i<tar3.length; i++){
			if(i==tar3.length-1){continue;}
			tar4[cnt++]=tar3[i];
		}
		
		result=new String(tar4);
		
		System.out.println(result);
		
	}

}



















