package com.bit.day21;


public class Ex12 extends Thread {
	static int sum;
	int first;
	int second;

	public static void main(String[] args) {
		int sum=0;
		// 1+2+3+...+1000=sum
		for(int i=1; i<=1000; i++){
			sum+=i;
		}
		System.out.println("1+2+3+...+1000="+sum);
		// 1+2+3+...+500=sum1
		Ex12 me=new Ex12();
		me.first=1;
		me.second=500;
		// 501+502+503+...+1000=sum2
		Ex12 you=new Ex12();
		you.first=501;
		you.second=1000;
		me.start();
		you.start();
		
		try {
			me.join();
			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("sum1+sum2="+Ex12.sum);
	}
	
	static Object key=new Object();
	
	public static void plus(int a, int b){
		for(int i=a; i<=b; i++){
			synchronized (key) {
				int su=sum+i;
				sum=su;						
			}
		}
	}
	
	// 동기화(메서드 동기화 -synchronized)
//	public static synchronized void plus(int i){
//		int su=sum+i;
//		sum=su;
//	}
	
	public void run() {
		plus(first,second);
//		for(int i=first; i<=second; i++){
////			sum+=i;
//			plus(i);
////			System.out.println(i+","+sum);
//		}
	}

}












