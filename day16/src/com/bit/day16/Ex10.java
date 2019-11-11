package com.bit.day16;

public class Ex10 {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return this;
		return new Ex10();
	}
	
	@Override
	public int hashCode() {
		return num;
	}
	
	@Override
	public String toString() {
		return "³ª";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.num==((Ex10)obj).num;
//		return true;
	}
	int num=16;
	
	public static void main(String[] args) {
		// Object class
		
		Object obj=new Object();
//		obj.clone();
		Ex10 me = new Ex10();
		Object you=null;
		try {
			you=me.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(me==you);
		System.out.println(me.equals(you));
		System.out.println(me.equals(obj));

	}

}
