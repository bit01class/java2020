package com.bit.day19;

import java.awt.Frame;

import javax.swing.JFrame;

public class Ex15 {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		// 0 아무일도 안함
		// 1	JFrame.HIDE_ON_CLOSE	:visible=false;
		// 2	JFrame.DISPOSE_ON_CLOSE	:dispose
		// 3	JFrame.EXIT_ON_CLOSE	:exit
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setBounds(100-1024,100,200,200);
		f.setVisible(true);

	}

}
