package com.bit.sec;

public class Lec03 { // final class Lec03 {
	// Ŭ���� final : ��Ӱź�
	protected int su1=1111;
	public static int su2=2222;
	// �ʵ� final : ����� ����
	
	public Lec03() {
	}
	
	public void func01(){
		System.out.println("Lec03 func01..."+su1);
	}
	// ���������� [final] �ڷ��� �̸�..
	// �޼����� final : �������̵��� �ź�
	protected final void func03(){
		System.out.println("Lec03 func03..."+su1);
	}
	public static void func02(){
		System.out.println("Lec03 func02..."+su2);
	}

}
