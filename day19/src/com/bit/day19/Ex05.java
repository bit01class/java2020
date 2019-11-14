package com.bit.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex05 extends Frame implements MouseListener{
	
	class MyMouse implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			System.out.println("버튼을 클릭했음");
		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public Ex05() {
		Panel p=new Panel();
		
		Button btn=new Button("버튼");
		MyMouse mouseAction=new MyMouse();
		btn.addMouseListener(mouseAction);
		p.addMouseListener(this);
		
		p.add(btn);
		add(p);
		setBounds(100-1024,100,400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();

	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("마우스버튼 눌리는");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스버튼 눌렸다올라오는");
	}

	public void mouseEntered(MouseEvent e) {
//		System.out.println("마우스가 들어옴");
	}

	public void mouseExited(MouseEvent e) {
//		System.out.println("마우스가 빠져나감");
	}

}
