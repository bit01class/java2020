package com.bit.day21;

public class Ex05 extends Thread{
	
	public Ex05(String name) {
		super(name);
	}

	public static void main(String[] args) {
		Thread mainThr=Thread.currentThread();
		String name=mainThr.getName();
		System.out.println(name+" 시작");
		Ex05 me = new Ex05("1번째");
//		me.setName("첫번째");
		Ex05 you = new Ex05("2번째");
//		you.setName("두번째");
		me.start();
		you.start();
		System.out.println(name+" 종료");
	}
	
	public void run() {
		String name=getName();
		System.out.println(name+"스레드 시작");
		for(int i=0; i<10; i++){
			System.out.println(name+":"+i);
		}
		System.out.println(name+"스레드 종료");
	}

}
