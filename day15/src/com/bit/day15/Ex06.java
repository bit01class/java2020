package com.bit.day15;

class Box3<T>{
	T su;
	public void setSu(T su){
		this.su=su;
	}
	public T getSu(){
		return su;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Box3<? super Number> box=new Box3<>();
		box.setSu(1111);
		box.setSu(3.14);
		
		Number su = ((Box3<? extends Number> )box).getSu();
	}
	
	public static void func(Box3<? extends Number> box){}

}












