package com.bit.day21;


public class Ex04 {
	

	public static void main(String[] args) {
		Thread me = new Thread(){ 
			public void run() {
				for(int i=0; i<100; i++){
					System.out.println("me thread"+i);
				}
			}
		};
		
		Thread you = new Thread(){ 
			public void run() {
				for(int i=0; i<100; i++){
					System.out.println("you thread"+i);
				}
			}
		};

		me.start();
		you.start();
	}

}
