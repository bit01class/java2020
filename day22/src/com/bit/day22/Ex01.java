package com.bit.day22;

public class Ex01 extends Thread {

	public static void main(String[] args) {
		System.out.println("���ν���");
		Ex01 me=new Ex01();
		me.setDaemon(true);
		me.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��������");

	}
	
	
	public void run() {
		while(true){
			System.out.println("������ Ȱ����...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
