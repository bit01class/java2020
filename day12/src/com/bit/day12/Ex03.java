package com.bit.day12;
// �߻�Ŭ����(�߻�޼��� 0���̻� ���� Ŭ����)
abstract class Cl03{
	int su1=1234;
	
	public static void func01(){
		System.out.println("Cl03 static func01()...");
	}
	
	public void func02(){
		System.out.println("Cl03 non-static func02()...");
	}
	// �߻�޼���(����o, ����x)
//	public abstract void func03();
	public void func04(){}
}

class Cl33 extends Cl03{
	//�߻�Ŭ������ ����� ���� �߻�Ŭ������ �ǰų�
	//�߻�޼��带 �������̵����� ������
	
}


public class Ex03 {

	public static void main(String[] args) {
		// 
//		Cl03 cl03=new Cl03();
		Cl33 cl33=new Cl33();
		
	}

}












