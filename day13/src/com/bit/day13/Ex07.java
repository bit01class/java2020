package com.bit.day13;

class Outter07{
	static int su1=1111;
	int su2=2222;
	
	
	static class Inner07{
		static int su3=3333;
		int su4=4444;
		public Inner07() {
			System.out.println("Inner...");
		}
		
		static void func01(){
			System.out.println("Inner static f3...");
			System.out.println("static su1="+su1);
			Outter07.func01();
			Outter07 outt=new Outter07();
			System.out.println(outt.su2);
			outt.func02();
		}
		
		void func02(){
			System.out.println("Inner f4...");
			System.out.println("static su1="+su1);
			Outter07.func01();
			Outter07 outt=new Outter07();
			System.out.println("su2="+outt.su2);
			outt.func02();
		}
		
	}
	
	public Outter07() {
		System.out.println("Outter...");
	}
	
	public static void func01(){
		System.out.println("Outter static f1...");
//		System.out.println(Inner07.su3);
//		Inner07.func03();
//		Inner07 inn2=new Inner07();
//		System.out.println(inn2.su4);
//		inn2.func04();
	}
	
	public void func02(){
		System.out.println("Outter static f2...");
//		System.out.println(Inner07.su3);
//		Inner07.func03();
//		Inner07 inn2=new Inner07();
//		System.out.println(inn2.su4);
//		inn2.func04();
	}
}

public class Ex07 {

	public static void main(String[] args) {
		System.out.println(Outter07.Inner07.su3);
		Outter07.Inner07.func01();
		
		Outter07.Inner07 inn=new Outter07.Inner07();
		System.out.println(inn.su4);
		inn.func02();
	}

}












