package com.bit.day21;

public class Ex09 extends Thread {

	public Ex09(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		System.out.println("메인 시작");
		Ex09 me=new Ex09("첫번째");
		Ex09 you=new Ex09("두번째");
		me.start();
		you.start();
		
		try {
//			me.join();
			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 종료");
	}
	
	public void run() {
		String name=getName();
		System.out.println(name+"시작");
		for(int i=5; i>=0; i--){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"종료");
	}

}
