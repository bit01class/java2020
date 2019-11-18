package com.bit.day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Ex16 extends Frame implements Runnable{
	Panel p1=new Panel();
	JButton[] jbtn=new JButton[16];
	
	public Ex16() {
		setLayout(new BorderLayout());
		Panel p2=new Panel();
		
		
		p1.setLayout(new GridLayout(4,4));
		Toolkit kit = Toolkit.getDefaultToolkit();
		String[] imgNms={"2001.png","2002.png","2003.png","2004.png"};
		for(int i=0; i<16; i++){
			
			Image img = kit.getImage(imgNms[i/4]);
			Icon icon=new ImageIcon(img);
			JButton btn = new JButton(icon);
			if(i/4==0){
				btn.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						System.out.println("아오리...");
					}
				});
			}
			jbtn[i]=btn;
			btn.setEnabled(false);
			p1.add(btn);
		}
		Button startBtn = new Button("시작");
		final Ex16 me = this;
		startBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Thread thr=new Thread(me);
				thr.start();
			}
		});
		p2.add(startBtn);
		p2.add(new Button("종료"));
		
		add(new Label("아오리사과를 선택하세요"),BorderLayout.NORTH);
		add(new Label("60초 0점"),BorderLayout.SOUTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.EAST);
		setBounds(100-1024,100,600,600);
		setVisible(true);
		
	}
	int limit=10;
	public void play(){
		for(int i=0; i<jbtn.length; i++){
			jbtn[i].setEnabled(true);
		}
		while(--limit>0){
			mix();
			try {
				Thread.sleep(500);
				this.revalidate();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mix();
			try {
				Thread.sleep(500);
				this.revalidate();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<jbtn.length; i++){
			jbtn[i].setEnabled(false);
		}
	}
	public void mix(){
		Random random=new Random();
		for(int i=0; i<1000; i++){
			int ran=random.nextInt(16);
			
			JButton temp = jbtn[0];
			jbtn[0]=jbtn[ran];
			jbtn[ran]=temp;
		}
		for(int i=0; i<16; i++){
			p1.add(jbtn[i]);
		}		
	}

	public static void main(String[] args) {
		new Ex16();
	}
	public void run() {
		play();
		
	}

}















