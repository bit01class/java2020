package com.bit.day18;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex09 extends Frame{
	
	public Ex09() {
		BorderLayout lay1=new BorderLayout();
		BorderLayout lay2=new BorderLayout();
		GridLayout lay3=new GridLayout(6,1);
		GridLayout lay4=new GridLayout(6,1);
		setLayout(lay1);
		Panel center=new Panel();
		Panel center1=new Panel();
		Panel center2=new Panel();
		center.setLayout(lay2);
		center1.setLayout(lay3);
		center2.setLayout(lay4);
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
		
		center1.add(la2);
		center1.add(la3);
		center1.add(la4);
		center1.add(la5);
		center1.add(la6);
		center1.add(la7);
		
		center2.add(tf1);
		center2.add(tf2);
		center2.add(tf3);
		Panel radio=new Panel();
		radio.add(box1);
		radio.add(box2);
		radio.add(box3);
		center2.add(radio);
		center2.add(cho);
		
		
		center.add(center1,BorderLayout.WEST);
		center.add(center2,BorderLayout.CENTER);
		
		
		add(la1,BorderLayout.NORTH);
		add(ta,BorderLayout.SOUTH);
		add(center,BorderLayout.CENTER);
		////////////////////
		
		setBounds(200-1024,200,300,400);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Ex09();

	}

}
