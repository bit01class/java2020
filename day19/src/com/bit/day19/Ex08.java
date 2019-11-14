package com.bit.day19;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex08 extends Frame implements KeyListener{
	final double LIMITX;
	final double LIMITY;
	
	public Ex08() {
		Panel p=new Panel();
		p.setLayout(null);
		Button la=new Button("¡Ú");
		la.setLocation(0, 0);
		la.setSize(20, 20);
		
		la.addKeyListener(this);
		
		p.add(la);
		add(p);
		setBounds(100-1024,100,500,500);
		setVisible(true);
		Dimension ps = p.getSize();
		LIMITX=ps.getWidth()-la.getWidth();
		LIMITY=ps.getHeight()-la.getHeight();
	}

	public static void main(String[] args) {
		new Ex08();
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		//39
//		40
//		37
//		38
		Button target=(Button) e.getSource();
		int x=target.getX();
		int y=target.getY();
		if(e.getKeyCode()==39&&x+20<LIMITX){
			x+=20;
		}else if(e.getKeyCode()==39){
			x=(int)LIMITX;
		}else if(e.getKeyCode()==40&&y+20<LIMITY){
			y+=20;
		}else if(e.getKeyCode()==40){
			y=(int) LIMITY;
		}else if(e.getKeyCode()==37&&x-20>0){
			x-=20;
		}else if(e.getKeyCode()==37){
			x=0;
		}else if(e.getKeyCode()==38&&y-20>0){
			y-=20;
		}else if(e.getKeyCode()==38){
			y=0;
		}
		target.setLocation(x,y);
	}

}









