package com.bit.day13;

class Outter09{
	static int su1=1111;
	int su2=2222;
	
	class Inner09{
		int su3=3333;
		
		public Inner09() {
			System.out.println("new Inner()...");
		}
		
		public void func03(){
			System.out.println("Inner func03()...");
//			System.out.println(su1);
//			System.out.println(su2);
//			func01();
			func02();
		}
	}
	
	public Outter09() {
	}
	
	public static void func01(){}
	public void func02(){
		System.out.println("Outter f2...");
//		Inner09 inn2=new Inner09();
//		System.out.println(inn2.su3);
//		inn2.func03();
	}
	
}

public class Ex09 {

	public static void main(String[] args) {

		Outter09 outt=new Outter09();
		Outter09.Inner09 inn=null;
		inn=outt.new Inner09();
//		System.out.println(inn.su3);
		inn.func03();
	}

}












