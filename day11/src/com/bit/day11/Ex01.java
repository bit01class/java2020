package com.bit.day11;

class Lec01{
	int su1=1234;
	static int su2=4321;
	
	Lec01() {
		// TODO Auto-generated constructor stub
	}
	
	static Lec01 me=new Lec01();
	
	static Lec01 newInstance(){
		return me;
	}
	
	public void func01(){
		System.out.println("func01..."+su1);
	}
	static void func02(){
		System.out.println("func02..."+su2);
	}
}


public class Ex01 extends com.bit.sec.Lec03{
	// ����������
	// Ŭ���� (public , default)
	// ������ (public, default, private)
	// �ʵ�, �޼���
	// public > protected >= default > private 
	// public(��𼭳� �������)
	// protected(default�� �����ϳ� ����� ���� ������ ���)
	// default (������Ű�������� �������)
	// private(Ŭ���� ���ο����� ������� )

	public static void main(String[] args) {
		// Ŭ����
//		System.out.println(com.bit.sec.Lec03.su2);
//		com.bit.sec.Lec03.func02();
//		com.bit.sec.Lec03 lec01=new com.bit.sec.Lec03();
//		System.out.println(lec01.su1);
//		lec01.func01();
//		Lec01 ex01=new Lec01();
//		Lec01 ex02=new Lec01();
		
//		Lec01 ex01=Lec01.newInstance();
//		Lec01 ex02=Lec01.newInstance();
//		System.out.println(ex01==ex02);
		
		Ex01 me =new Ex01();
		System.out.println(me.su1);
		me.func01();
	}
 
}
















