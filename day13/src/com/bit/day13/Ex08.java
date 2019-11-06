package com.bit.day13;

public class Ex08 {
	
	class Inner08{
		int su1=1111;
//		static int su2=2222;
		static final int su3=2222;
		
		public Inner08() {
		}
		
//		public static void func02(){}
		
		public void func01(){
			System.out.println("Inner08 func01()...");
		}
	}
	
	public void func(){
		Inner08 inn=new Inner08();
		System.out.println(inn.su1);
		inn.func01();		
	}

	public static void main(String[] args) {
		// ¸â¹öÅ¬·¡½º
		Ex08 me = new Ex08();
//		me.func();
		Inner08 inn=null;
		inn=me.new Inner08();
		System.out.println(inn.su1);
		inn.func01();		
	}

}
