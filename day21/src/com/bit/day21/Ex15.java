package com.bit.day21;

public class Ex15 extends Thread{
	static Ex15 me = new Ex15();
	
	static class Ex55 extends Thread{
		public void run() {
			while(true){
				System.out.println(me.getState());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex55 you=new Ex55();
		you.start();
		
		
		if(me.getState()==Thread.State.NEW){
			me.start();
		}else if(me.getState()==Thread.State.TIMED_WAITING){
			me.interrupt();
		}
		
		
//		try {
			
//			me.start();
//			Thread.sleep(1000);
//			me.suspend();
//			Thread.sleep(1000);
//			me.resume();
//			Thread.sleep(1000);
//			me.suspend();
//			Thread.sleep(1000);
//			me.resume();
//			Thread.sleep(1000);
//			me.stop();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
	
	public void run() {
		while(true){
			System.out.println("½ÇÇà");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
