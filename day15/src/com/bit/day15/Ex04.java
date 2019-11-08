package com.bit.day15;

class Box2<T,V>{
	T su;
	V msg;
	
	public void setSu(T su){
		this.su=su;
	}
	public void setMsg(V msg){
		this.msg=msg;
	}
	
	public T getSu(){
		return su;
	}
	public V getMsg(){
		return msg;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Box2<Integer,String> box=new Box2<Integer,String>();
		
		box.setSu(1111);
		box.setMsg("환영합니다");
		
		int su=box.getSu();
		String msg=box.getMsg();
		
		System.out.println(su);
		System.out.println(msg);

	}

}










