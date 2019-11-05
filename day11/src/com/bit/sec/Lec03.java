package com.bit.sec;

public class Lec03 { // final class Lec03 {
	// 클래스 final : 상속거부
	protected int su1=1111;
	public static int su2=2222;
	// 필드 final : 상수형 변수
	
	public Lec03() {
	}
	
	public void func01(){
		System.out.println("Lec03 func01..."+su1);
	}
	// 접근제한자 [final] 자료형 이름..
	// 메서드의 final : 오버라이드의 거부
	protected final void func03(){
		System.out.println("Lec03 func03..."+su1);
	}
	public static void func02(){
		System.out.println("Lec03 func02..."+su2);
	}

}
