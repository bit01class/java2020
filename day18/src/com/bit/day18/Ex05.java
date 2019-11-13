package com.bit.day18;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

public class Ex05 extends Frame{
	
	public Ex05() {
		java.awt.Label la1=new Label("¹®ÀÚ¿­");
		
		Panel p1= new Panel();
		List list=new List(5,true);
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		list.addItem("item5");
		
		p1.add(list);
		add(p1);
		setBounds(200-1024,200,400,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();
	}

}
