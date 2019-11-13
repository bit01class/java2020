package com.bit.day18;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex02 {

	public static void main(String[] args) {
		Panel p1=new Panel();
		java.awt.Frame frame=new Frame();
		
		java.awt.TextArea ta=new TextArea("",4,15,TextArea.SCROLLBARS_NONE);
//		java.awt.TextArea ta=new TextArea("",4,15);
//		java.awt.TextArea ta=new TextArea();
//		ta.setColumns(15);
//		ta.setRows(2);
//		ta.setText("�ʱⰪ");
//		ta.setVisible(false);
//		ta.setEditable(false);
//		ta.setEnabled(false);
		
		
		p1.add(ta);
		frame.add(p1);
		frame.setLocation(200-1024,200);
		frame.setSize(400,300);
		frame.setVisible(true);
		
	}

}
