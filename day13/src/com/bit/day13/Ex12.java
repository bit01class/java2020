package com.bit.day13;

interface Inter12{
	void func01();
}

public class Ex12 {

	public static void main(String[] args) {
		Inter12 ele = new Inter12(){
			public void func01(){}
		};
		ele.func01();

	}

}
