package com.bit.day21;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class Ex13 extends Thread {

	public void run() {
		System.out.println(getName()+"스레드시작");
		func01();
		System.out.println(getName()+"스레드종료");
	}
	
	public synchronized void func01(){
		System.out.println("잠시 쉬겠습니다");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("func01 종료");
	}
	
	public synchronized void func02(){
//		notify();
		notifyAll();
	}
	
	public static void main(String[] args) {
		Ex13 me =new Ex13();
		Ex13 you =new Ex13();
		
		me.start();
		you.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		me.func02();
		you.func02();
	}

}













