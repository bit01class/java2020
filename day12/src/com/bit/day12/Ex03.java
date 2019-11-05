package com.bit.day12;
// 추상클래스(추상메서드 0개이상 같는 클래스)
abstract class Cl03{
	int su1=1234;
	
	public static void func01(){
		System.out.println("Cl03 static func01()...");
	}
	
	public void func02(){
		System.out.println("Cl03 non-static func02()...");
	}
	// 추상메서드(선언o, 구현x)
//	public abstract void func03();
	public void func04(){}
}

class Cl33 extends Cl03{
	//추상클래스의 상속은 나도 추상클래스가 되거나
	//추상메서드를 오버라이드함을 강제함
	
}


public class Ex03 {

	public static void main(String[] args) {
		// 
//		Cl03 cl03=new Cl03();
		Cl33 cl33=new Cl33();
		
	}

}












