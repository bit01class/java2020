package com.bit.day18;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex10 extends Frame{
	
	public Ex10() {

		////////////////////
		Label la1=new Label("ȸ������");
		Label la2=new Label("id");
		Label la3=new Label("pw");
		Label la4=new Label("�̸�");
		Label la5=new Label("���");
		Label la6=new Label("�з�");
		Label la7=new Label("�ڱ�Ұ�");
		
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		
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
		
		setBounds(200-1024,200,300,400);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Ex10();

	}

}
