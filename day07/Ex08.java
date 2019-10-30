package com.bit;

class Car3{
	int speed=0;
	int max;
	int accel;
	String model;
	String color;

	public Car3(int c,int d){
		color="은색";
		model="기아차";
		accel=c;
		max=d;
	}

	public Car3(String a, String b, int c,int d){
		color=a;
		model=b;
		accel=c;
		max=d;
	}

	public void speedUp(){
		if(speed+accel<=max){
		speed+=accel;
		}else{
		speed=max;
		}
	}

	public void speedDown(){
		if(speed-accel>=0){
		speed-=accel;
		}else{
		speed=0;
		}
	}

	public void show(){
		System.out.println(
		color+"인 내차 "
		+model+"이(가) "
		+speed+"km로 달리고 있습니다");
	}
}

class Ex08{

 public static void main(String[] args){
	Car3 my=new Car3(35,350);

	for(int i=0; i<20; i++){
		my.speedUp();
		my.show();
	}

	for(int i=0; i<20; i++){
		my.speedDown();
		my.show();
	}
 }

}









