package com.bit.day21;

public class Ex07 implements Runnable{

	public static void main(String[] args) {
		// ���������� - �켱����
		Ex07 me =new Ex07();
		Thread thr1=new Thread(me,"ù��°");
		Thread thr2=new Thread(me,"�ι�°");
		Thread thr3=new Thread(me,"����°");
		thr1.setPriority(Thread.MIN_PRIORITY);
		thr2.setPriority(Thread.NORM_PRIORITY);
		thr3.setPriority(Thread.MAX_PRIORITY);
		thr1.start();
		thr2.start();
		thr3.start();

	}

	public void run() {
		Thread thr=Thread.currentThread();
		String name=thr.getName();
		System.out.println(name+"����"+thr.getPriority());
		for(int i=0; i<5000; i++){
			System.out.println(name+i);
		}
		System.out.println(name+"����");
	}

}
