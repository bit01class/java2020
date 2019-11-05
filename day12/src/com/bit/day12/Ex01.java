package com.bit.day12;

class Cl01{
	int num1=1234;
	
	public Cl01() {}
	
	void func01(){
		System.out.println("부모클래스의 func01...");
	}
	
	public final void func02(){
		System.out.println("부모클래스의 final func02...");
	}
}

class Cl101 extends Cl01{
	int num1=1111;
	int num2=2222;
	
	//오버라이드(접근제한자는 같거나 오픈된)
	public void func01(){
		System.out.println("자식클래스의 func01...");
	}
	
	public void func03(){
		System.out.println("자식클래스의 func03...");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 상속
		System.out.println("parent object>----------------------");
		Cl01 parent =new Cl01();
		System.out.println(parent.num1);
		parent.func01();
		parent.func02();
		System.out.println("child object>----------------------");
		Cl101 child=new Cl101();
		System.out.println(child.num2);
		child.func03();
		System.out.println(child.num1);
		child.func01();
		child.func02();
		System.out.println("parent type>----------------------");
		// 다형성
//		Cl101 cl1=new Cl01();
		Cl01 cl1=new Cl101();
		cl1.func01();
		cl1.func02();
//		cl1.func03();
		System.out.println(cl1.num1);
//		System.out.println(cl1.num2);
		System.out.println("child type>-------------------------");
		Cl101 cl2=(Cl101)cl1;
		System.out.println(cl2.num1);
		System.out.println(cl2.num2);
		cl2.func01();
		cl2.func02();
		cl2.func03();
		
			
	}

}















