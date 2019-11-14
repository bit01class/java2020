package com.bit.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex10 extends Frame implements ComponentListener{

	public Ex10() {
		Button btn=new Button();
		final Ex10 me=this;
		btn.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			
			public void mouseClicked(MouseEvent e) {
				me.setVisible(false);
			}
		});
		add(btn);
		addComponentListener(this);
		setLocation(100-1024,100);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();

	}

	public void componentResized(ComponentEvent e) {
		System.out.println("componentResized");
	}

	public void componentMoved(ComponentEvent e) {
		System.out.println("componentMoved");
	}

	public void componentShown(ComponentEvent e) {
		System.out.println("componentShown");
	}

	public void componentHidden(ComponentEvent e) {
		System.out.println("componentHidden");
	}

}
