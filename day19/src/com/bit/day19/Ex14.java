package com.bit.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex14 extends Frame{

	public Ex14() {
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.out.println("´Ý±â");
			}
			
		});
		
		Button btn =new Button("btn");
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(btn);
		setBounds(100,100,300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex14();

	}

}
