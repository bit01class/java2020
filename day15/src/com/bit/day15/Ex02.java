package com.bit.day15;


class Ball{
	String color="검은색";
	
	public void play(){
		System.out.print("굴린다");
	}
	public void publicFunc1(){}
	public void publicFunc2(){}
}

class BaseBall extends Ball{
	String color="흰색";
	
	public void play(){
		System.out.println("던진다");
	}
}

class Bowling extends Ball{
	public void play(){
		System.out.print("핀을 향해 ");
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













