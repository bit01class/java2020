package com.bit.day12;

public class Ex02 {
	int su=1234;
	public void func01(){
		System.out.println("func01...");
	}

	public static void main(String[] args) {
		// 
		Object me=new Ex02();
		System.out.println(me.toString());
		System.out.println(((Ex02)me).su);
		System.out.println("--------------------");
		int su1=5;
		int su2=2;
		double su3=1.5;
		double su4=0.5;
		Number su5=new Integer(su1);
		Number su6=new Integer(su2);
		System.out.println(su1+"+"+su2+"="+plus(su1,su2));
		System.out.println(su1+"+"+su4+"="+plus(su1,su4));
		System.out.println(su3+"+"+su4+"="+plus(su3,su4));
		System.out.println(su1+"-"+su2+"="+minus(su1,su2));
		System.out.println(su1+"x"+su2+"="+multi(su1,su2));
		System.out.println(su1+"¡À"+su2+"="+div(su1,su2));
		System.out.println(5+"¡À"+2+"="+div(5,2));
		System.out.println(6+"¡À"+2+"="+div(6,2));
		System.out.println(2.5+"¡À"+1.5+"="+div(2.5,1.5));
	}
	
	public static Number div(int a, int b){
		if(a%b==0){
			return a/b;
		}else {
			return a*1.0/b;
		}
	}
	
	public static Number div(double a, double b){
		if(a%b==0){
			return a/b;
		}else {
			return a*1.0/b;
		}
	}
	
	////////////////////////////////////
	
	public static int multi(int a, int b){
		return a*b;
	}
	
	public static int plus(int a, int b){
		return a+b;
	}
	
	public static double plus(double a, double b){
		return a+b;
	}

	public static int minus(int a, int b){
		return a-b;
	}
}














