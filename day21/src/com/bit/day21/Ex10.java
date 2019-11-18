package com.bit.day21;

public class Ex10 extends Thread {

	public static void main(String[] args) {
		System.out.println("main start");
		Ex10 me=new Ex10();
		me.start();
		try {
			me.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

	
	public void run() {
		String name=getName();
		System.out.println(name+"시작");
		for(int i=0; i<10; i++){
			System.out.println(name+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"종료");
	}
}
