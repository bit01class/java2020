package com.bit.day12;

interface �ӽ��������ϴ�Ŭ����{}

interface Machine2{
	void on();
	void off();
	void work();
}
class Tv2 implements Machine2{

	public void on() {
		System.out.println("");
	}

	public void off() {
		System.out.println("");
	}

	public void work() {
		System.out.println("");
	}
	
}

public class Ex07 implements �ӽ��������ϴ�Ŭ����{
	public static void main(String[] args) {
		Machine2 tv=new Tv2();
		tv.on();
		
	}
}







