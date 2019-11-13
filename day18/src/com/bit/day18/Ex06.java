package com.bit.day18;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex06 extends Frame{
	
	public Ex06() {
		Panel main =new Panel();
		////////////////////
		Label la1=new Label("회원가입                          ");
		Label la2=new Label("id      ");
		Label la3=new Label("pw    ");
		Label la4=new Label("이름     ");
		Label la5=new Label("취미");
		Label la6=new Label("학력");
		Label la7=new Label("자기소개");
		
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox box1=new Checkbox("운동",false,cbg);
		Checkbox box2=new Checkbox("독서",false,cbg);
		Checkbox box3=new Checkbox("게임",false,cbg);
		
		Choice cho=new Choice();
		cho.add("고졸");
		cho.add("초대졸");
		cho.add("대졸");
		cho.add("대학원졸");
		
		TextArea ta=new TextArea();
		////////////////////
		
		main.add(la1);
		main.add(la2);
		main.add(tf1);
		main.add(la3);
		main.add(tf2);
		main.add(la4);
		main.add(tf3);
		main.add(la5);
		main.add(box1);
		main.add(box2);
		main.add(box3);
		main.add(la6);
		main.add(cho);
		main.add(la7);
		main.add(ta);
		
		
		////////////////////
		add(main);
		setBounds(200-1024,200,200,400);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Ex06();

	}

}
