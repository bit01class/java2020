package com.bit.day19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;



public class Ex02 extends Frame{
	
	public Ex02() {
		Color color=new Color(0xff,0,0);
		color=Color.blue;
		Font font=new Font(Font.SERIF,Font.BOLD,20);
		Panel p=new Panel();
		Label la=new Label("¹®ÀÚ¿­\r\nabcd\t1234");
		la.setFont(font);
		la.setBackground(color);
		p.setBackground(color);
		p.add(la);
		add(p);
		setBounds(100-1024,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
