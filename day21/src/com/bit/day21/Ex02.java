package com.bit.day21;

public class Ex02 extends Thread{

	public static void main(String[] args) {
		// ������
		Ex02 thr1=new Ex02();
		thr1.start();
		
		for(int i=0; i<1000; i++){
			System.out.println("����1");
		}
		System.out.println("���� ������ ����");
	}
	
	public void run() {
		for(int i=0; i<1000; i++){
			System.out.println("����2");
		}
		System.out.println("������ ����");
	}

}
