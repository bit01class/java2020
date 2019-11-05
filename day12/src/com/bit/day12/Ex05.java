package com.bit.day12;

//인터페이스
interface Inter01{
	// 상수형 스테틱 변수
	public static final int num1=1111;
	public final int num2=2222;
	public int num3=3333;
	int num4=4444;
	
	public abstract void func01();
	public void func02();
	void func03();
}

public class Ex05 implements Inter01{

	public static void main(String[] args) {
		Inter01 me=new Ex05();
		me.func01();
		System.out.println(Inter01.num1);
		System.out.println(Inter01.num2);
		System.out.println(Inter01.num3);
		
	}

	public void func01() {
		System.out.println("Ex05에서 구현한 func01...");
	}

	public void func02() {
		// TODO Auto-generated method stub
	}

	public void func03() {
		// TODO Auto-generated method stub
	}

}
