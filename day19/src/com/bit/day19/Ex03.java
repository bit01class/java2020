package com.bit.day19;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Ex03 extends Frame{
	
	class MyCanvas extends Canvas{
		public void paint(Graphics g){
			g.drawString("java", 100, 100);
			
			g.drawLine(50, 200, 300, 250);
			g.setColor(Color.GREEN);
			g.drawArc(50, 200, 200,200, 0,180);
			g.setColor(Color.RED);
//			g.drawRect(300, 100, 50, 50);
			g.draw3DRect(300, 100, 50, 50,true);
			g.drawOval(300, 300, 50, 100);
//			g.drawPolyline(xPoints, yPoints, nPoints)
//			g.drawPolygon(p);
//			g.fillRect(300, 100, 50, 50);
//			g.fillOval(300, 300, 50, 100);
		}
	}
	
	public Ex03() {
		
		Canvas can=new MyCanvas();
		add(can);
		setBounds(100-1024,100,500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
