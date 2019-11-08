package com.bit.day15;

class Template{
	public static <T>Box<T> newInstance(T val){
		Box<T> box=new Box<T>();
		box.set(val);
		return box;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Box<Ball> box=Template.<Ball>newInstance(new BaseBall());
		box.get().play();
	}

}
