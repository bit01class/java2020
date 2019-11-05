package com.bit.day12;

import java.util.Scanner;

abstract class Machine{
	public void on(){
		System.out.println("전원on");
	}
	public void off(){
		System.out.println("전원off");
	}
	public abstract void work();
}

class Tv extends Machine{

	public void work() {
		System.out.println("전파를 잡아 화면을 띄운다");
	}
	
}

class Radio extends Machine{

	public void work() {
		System.out.println("전파를 잡아 소리를 낸다");
	}
	
}

class Audio extends Machine{

	public void work() {
		System.out.println("mp3파일로 소리를 낸다");
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














