package com.bit.day18;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03 extends Frame{
	
	public Ex03() {
		
		Panel p1=new Panel();
		
		CheckboxGroup cbg=new CheckboxGroup();
		
		Checkbox box1=new Checkbox("item1",false,cbg);
//		box1.setLabel("item1");
		Checkbox box2=new Checkbox("item2",true,cbg);
//		box2.setLabel("item2");
//		box2.setState(true);
		Checkbox box3=new Checkbox("item3",true,cbg);
//		box3.setState(true);
		
		p1.add(box1);
		p1.add(box2);
		p1.add(box3);
		
		add(p1);
		setLocation(200-1024,200);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
