package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex13 extends Frame{
	
	public Ex13() {
		
		Panel main=new Panel();
		
		GridBagLayout gbl=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		main.setLayout(gbl);
		
		Button btn1=new Button("1");
		Button btn2=new Button("2");
		Button btn3=new Button("3");
		Button btn4=new Button("4");
		Button btn5=new Button("5");
		Button btn6=new Button("6");
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=0.25;
		gbc.weighty=1.0;
		gbl.setConstraints(btn1, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.weightx=0.25;
		gbc.weighty=1.0;
		gbl.setConstraints(btn2, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.weightx=0.25;
		gbc.weighty=1.0;
		gbl.setConstraints(btn3, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.weightx=0.25;
		gbc.weighty=1.0;
		gbl.setConstraints(btn4, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.weightx=1;
		gbc.weighty=1.0;
		gbl.setConstraints(btn5, gbc);
		

		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=4;
		gbc.gridy=0;
		gbc.weightx=0.25;
		gbc.weighty=1.0;
		gbl.setConstraints(btn6, gbc);
		
		
		main.add(btn1);
		main.add(btn2);
		main.add(btn3);
		main.add(btn4);
		main.add(btn5);
		main.add(btn6);
		
		add(main);
		setBounds(200-1024,100,400,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex13();

	}

}
