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
		Label la1=new Label("ȸ������                          ");
		Label la2=new Label("id      ");
		Label la3=new Label("pw    ");
		Label la4=new Label("�̸�     ");
		Label la5=new Label("���");
		Label la6=new Label("�з�");
		Label la7=new Label("�ڱ�Ұ�");
		
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox box1=new Checkbox("�",false,cbg);
		Checkbox box2=new Checkbox("����",false,cbg);
		Checkbox box3=new Checkbox("����",false,cbg);
		
		Choice cho=new Choice();
		cho.add("����");
		cho.add("�ʴ���");
		cho.add("����");
		cho.add("���п���");
		
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
