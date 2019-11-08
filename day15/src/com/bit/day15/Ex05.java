package com.bit.day15;

public class Ex05 {

	public static void main(String[] args) {
//		Box<BaseBall> box=new Box<>();
		Box<BaseBall> box;
		
		box=new Box<BaseBall>();
		box.set(new BaseBall());
		box.get().play();
	}

}
