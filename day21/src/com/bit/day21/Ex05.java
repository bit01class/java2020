package com.bit.day21;

public class Ex05 extends Thread{
	
	public Ex05(String name) {
		super(name);
	}

	public static void main(String[] args) {
		Thread mainThr=Thread.currentThread();
		String name=mainThr.getName();
		System.out.println(name+" ����");
		Ex05 me = new Ex05("1��°");
//		me.setName("ù��°");
		Ex05 you = new Ex05("2��°");
//		you.setName("�ι�°");
		me.start();
		you.start();
		System.out.println(name+" ����");
	}
	
	public void run() {
		String name=getName();
		System.out.println(name+"������ ����");
		for(int i=0; i<10; i++){
			System.out.println(name+":"+i);
		}
		System.out.println(name+"������ ����");
	}

}
