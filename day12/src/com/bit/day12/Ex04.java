package com.bit.day12;

import java.util.Scanner;

abstract class Machine{
	public void on(){
		System.out.println("����on");
	}
	public void off(){
		System.out.println("����off");
	}
	public abstract void work();
}

class Tv extends Machine{

	public void work() {
		System.out.println("���ĸ� ��� ȭ���� ����");
	}
	
}

class Radio extends Machine{

	public void work() {
		System.out.println("���ĸ� ��� �Ҹ��� ����");
	}
	
}

class Audio extends Machine{

	public void work() {
		System.out.println("mp3���Ϸ� �Ҹ��� ����");
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		Tv tv=new Tv();
		tv.on();
		tv.work();
		tv.off();
		System.out.println("-----------------------");
		Radio radio =new Radio();
		radio.on();
		radio.work();
		radio.off();
		System.out.println("-----------------------");
		Audio audio=new Audio();
		audio.on();
		audio.work();
		audio.off();
		System.out.println("-----------------------");
		Scanner sc=new Scanner(System.in);
		System.out.print("1.Tv 2.Radio 3.Audio>");
		int input=sc.nextInt();
		Machine remote=null;
		if(input==1){
			remote=new Tv();
		}else if(input==2){
			remote=new Radio();
		}else if(input==3){
			remote=new Audio();
		}
		remote.on();
		remote.work();
		remote.off();
	}

}














