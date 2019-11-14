package com.bit.day19;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex12 extends Frame implements TextListener{
	TextField tf;
	public Ex12() {
		
		tf=new TextField();
		tf.addTextListener(this);
		add(tf);
		setBounds(100-1024,100,300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex12();

	}

	public void textValueChanged(TextEvent e) {
		System.out.println(tf.getText());
	}

}
