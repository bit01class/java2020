package com.bit.day21;

public class Ex11 {
	static int num=0;

	public static void main(String[] args) {
		Thread thr1=new Thread(new Runnable() {
			public void run() {
				String name="ù��°";
				System.out.println(name+"����");
				for(int i=0; i<10; i++){
					while(num==0){Thread.yield();}
					System.out.println(name+i);
				}
				System.out.println(name+"����");
			}
		});
		Thread thr2=new Thread(new Runnable() {
			
			public void run() {
				String name="�ι�°";
				System.out.println(name+"����");
				for(int i=0; i<10; i++){
					if(i>5){num=1;}
					System.out.println(name+i);
				}
				System.out.println(name+"����");
			}
		});
		thr1.start();
		thr2.start();
	}

}
