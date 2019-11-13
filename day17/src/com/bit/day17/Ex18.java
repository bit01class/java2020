package com.bit.day17;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex18 {

	public static void main(String[] args) {
//		FlowLayout layout=new FlowLayout();
//		GridLayout layout=new GridLayout(2,2);
		CardLayout layout=new CardLayout();
		Frame frame=new Frame();
		frame.setLayout(layout);
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		
		Button btn1=new Button("버튼1");
		Button btn2=new Button("버튼2");
		Button btn3=new Button("버튼3");
		Button btn4=new Button("버튼4");
		
		p1.add(btn1);
		p2.add(btn2);
		p3.add(btn3);
		p4.add(btn4);
		
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);

		frame.setLocation(400-1024,200);
		frame.setSize(300,500);
		frame.setVisible(true);
		
		for(int i=0; i<1000; i++){
			layout.next(frame);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
