package com.bit.day21;

public class Ex03 implements Runnable {

	public static void main(String[] args) {
		Runnable me=new Ex03();
		
		Thread thr1=new Thread(new Runnable(){

			public void run() {
				for(int i=0; i<100; i++){
					System.out.println("me thread"+i);
				}
			}
			
		});
		Thread thr2=new Thread(new Runnable(){

			public void run() {
				for(int i=0; i<100; i++){
					System.out.println("you thread"+i);
				}
			}
			
		});
		
		thr1.start();
		thr2.start();
	}

	public void run() {
		for(int i=0; i<100; i++){
			System.out.println("thread"+i);
		}
	}

}
