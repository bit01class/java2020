package com.bit.day19;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex04 extends Frame implements WindowListener{
	
	public Ex04() {
		
		addWindowListener(this);
		
		setBounds(100-1024,100,300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();

	}

	public void windowOpened(WindowEvent e) {
		System.out.println("â����");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("â�ݱ�");
		//System.exit(0);
		this.dispose();
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("â�ּ�ȭ");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("â���ּ�ȭ");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("âȰ��ȭ");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("â��Ȱ��ȭ");
	}

}
