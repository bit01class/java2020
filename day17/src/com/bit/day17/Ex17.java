package com.bit.day17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;

public class Ex17 extends java.awt.Frame{
	
	public Ex17() {
//		java.awt.FlowLayout layout=new FlowLayout();
//		java.awt.GridLayout layout=new GridLayout(2,2);
		java.awt.BorderLayout layout=new BorderLayout();
		this.setLayout(layout);
		
//		java.awt.Panel p1=new Panel();
//		p1.setLayout(layout);
		
		java.awt.Button btn1=new Button();
		btn1.setLabel("��ư1");
		this.add(btn1,BorderLayout.NORTH);
		
		Button btn2=new Button();
		btn2.setLabel("��ư2");
		this.add(btn2,BorderLayout.CENTER);
		

		Button btn3=new Button();
		btn3.setLabel("��ư3");
		this.add(btn3,BorderLayout.SOUTH);
//		
//
		Button btn4=new Button();
		btn4.setLabel("��ư4");
		this.add(btn4,BorderLayout.WEST);
//		
//
		Button btn5=new Button();
		btn5.setLabel("��ư5");
		this.add(btn5,BorderLayout.EAST);
//		
//
//		Button btn6=new Button();
//		btn6.setLabel("��ư6");
//		p1.add(btn6);
//
//		Button btn7=new Button();
//		btn7.setLabel("��ư7");
//		p1.add(btn7);
//		this.add(p1);
		
		this.setLocation(200-1024, 300);
		this.setSize(200, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex17();

	}

}
