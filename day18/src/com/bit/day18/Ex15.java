package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex15 extends Frame{
	
	public Ex15() {
		
		Panel p=new Panel();
		GridBagLayout gbl=new GridBagLayout();
		p.setLayout(gbl);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		String[][] msg={
				{"Num","  /  ","  *  ","  -  "},
				{"  7  ","8","9","+"},
				{"  4  ","5","6"},
				{"  1  ","2","3","Ent"},
				{"  0  ",null,"."},
		};
		
		
		Button[][] btns=new Button[msg.length][];
		for(int i=0; i<msg.length; i++){
			btns[i]=new Button[msg[i].length];				
			for(int j=0; j<msg[i].length; j++){
				if(msg[i][j]==null){
					btns[i][j]=null;
				}else{
				btns[i][j]=new Button(msg[i][j]);
				}
			}
		}
		
		for(int i=0; i<btns.length; i++){
			for(int j=0; j<btns[i].length; j++){
				if(btns[i][j]==null){continue;}
				gbc.gridx=j;
				gbc.gridy=i;
				if(j==3&&i==1||j==3&&i==3){
					gbc.gridheight=2;
				}else{
					gbc.gridheight=1;					
				}
				if(j==0&&i==4){
					gbc.gridwidth=2;
				}else{
					gbc.gridwidth=1;
				}
				gbl.addLayoutComponent(btns[i][j], gbc);
				p.add(btns[i][j]);
			}
		}
		
		
		add(p);
		setBounds(100-1024,100,400,500);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Ex15();

	}

}











