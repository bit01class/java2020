package com.bit.day18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex01 extends Frame{
	
	public Ex01() {
		Font font=new Font(Font.SERIF,Font.ITALIC,22);
		
		setLayout(new BorderLayout());
		Panel top=new Panel();
		
		java.awt.TextField tf=new TextField();
//		tf.setText("화면에출력");
//		tf.setVisible(true);
//		tf.setEditable(false);
//		tf.setEnabled(false);
		tf.setColumns(20);
		tf.setEchoChar('#');
		top.add(tf);
		add(top,BorderLayout.NORTH);
		
		
		Panel p1=new Panel();
		GridLayout layout=new GridLayout(4,3);
		p1.setLayout(layout);
		
		Button[] btns=new Button[12];
		String[] nums={"7","8","9"
						,"4","5","6"
						,"1","2","3"
						,"*","0","#"};
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button();
			btns[i].setLabel(nums[i]);
			btns[i].setFont(font);
			p1.add(btns[i]);
		}
		
		add(p1,BorderLayout.CENTER);
		setLocation(200-1024,200);
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
