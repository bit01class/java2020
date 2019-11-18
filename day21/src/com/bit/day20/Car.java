package com.bit.day20;

public class Car implements java.io.Serializable{
	private static final long serialVersionUID=1234L;
	public int speed;
	transient public String color;
	
	public Car() {
		speed=100;
		color="red";
	}
	
	public void func(){
		
	}
	public void func2(){
		System.out.println("Ãâ·Â");
	}
	
}
