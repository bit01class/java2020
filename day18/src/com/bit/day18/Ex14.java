package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex14 extends Frame{
	
	public Ex14() {
		Panel p=new Panel();
		GridBagLayout layout=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		p.setLayout(layout);
		Button[] btns=new Button[10];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(""+(1+i));
		}
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridheight=1;
		gbc.gridwidth=1;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.addLayoutComponent(btns[0], gbc);
		gbc.gridx=1;
		layout.addLayoutComponent(btns[1], gbc);
		gbc.gridx=2;
		layout.addLayoutComponent(btns[2], gbc);
		gbc.gridx=3;
		layout.addLayoutComponent(btns[3], gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=4;
		layout.addLayoutComponent(btns[4], gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=3;
		layout.addLayoutComponent(btns[5], gbc);
		gbc.gridx=3;
		gbc.gridwidth=1;
		layout.addLayoutComponent(btns[6], gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridheight=2;
		layout.addLayoutComponent(btns[7], gbc);
		gbc.gridx=1;
		gbc.gridheight=1;
		gbc.gridwidth=3;
		layout.addLayoutComponent(btns[8], gbc);
		gbc.gridy=4;
		layout.addLayoutComponent(btns[9], gbc);
		
		
		
		
		
		for(int i=0; i<btns.length; i++){
			p.add(btns[i]);
		}
		add(p);
		setBounds(200-1024,100,400,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex14();

	}

}
