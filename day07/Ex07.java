package com.bit;

class Ex07{
 final int num;
 static int num2;

 // 클래스의 구성요소
 // 1. 메서드
 // 2. 필드
 // 3. 생성자
 //	-클래스명(){}
 //	-클래스명([참조변수]){}
 //	-클래스명([참조변수],[참조변수]){}
 // 	-존재x일때, 자동 default create
 //	-존재o일때, default x
 //	-하나의 객체에서 생성자의호출은
 //	 단한번 이루어짐
 //	-객체 생성시 하고 싶은일(필드의 초기화)

 public Ex07(){	
	 num=1111;
 }

 public static void main(String[] args){
	//final int a=1111;
	//a++;
	//System.out.println("a="+a);
	
	Ex07 me = new Ex07();	
	System.out.println(me.num);
	/*
	me.func(4321);
	System.out.println(me.num);
	*/
 }

 public void func(int a){
	//num=a;
 }

}