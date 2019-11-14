package com.bit.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Ex11 extends Frame implements FocusListener {
	TextField tf1,tf2;
	public Ex11() {
		
		Panel p=new Panel();
		
		tf1=new TextField("id입력");
		tf1.addFocusListener(this);
		tf2=new TextField("pw입력");
		tf2.setEchoChar('*');
		Button btn=new Button("전송");
		p.add(tf1);
		p.add(tf2);
		p.add(btn);
		add(p);
		setBounds(100-1024,100,200,400);
		setVisible(true);
		this.setFocusable(true);
	}

	public static void main(String[] args) {
		new Ex11();
	}

	public void focusGained(FocusEvent e) {
		System.out.println("포커스를 얻을 때");
		tf1.setText("");
		
	}

	public void focusLost(FocusEvent e) {
		System.out.println("포커스를 잃을 때");
		String msg=tf1.getText();
		if(msg.length()==0){
			tf1.setText("id입력");
		}
	}

}
