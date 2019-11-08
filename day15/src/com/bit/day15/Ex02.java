package com.bit.day15;


class Ball{
	String color="������";
	
	public void play(){
		System.out.print("������");
	}
	public void publicFunc1(){}
	public void publicFunc2(){}
}

class BaseBall extends Ball{
	String color="���";
	
	public void play(){
		System.out.println("������");
	}
}

class Bowling extends Ball{
	public void play(){
		System.out.print("���� ���� ");
		super.play();
	}
}

class Box<T>{
	T ball;
	
	public void set(T ball){
		this.ball=ball;
	}
	public T get(){
		return this.ball;
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		BaseBall ball1 =new BaseBall();
		Bowling ball3 =new Bowling();

		Box<Ball> box=new Box<Ball>();
		box.set(ball3);
		
		Ball ball2= box.get();
		ball2.play();
	}

}













