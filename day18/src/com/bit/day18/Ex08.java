package com.bit.day18;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex08 extends Frame{
	
	public Ex08() {
		GridLayout gl=new GridLayout(8,1);
		setLayout(gl);
		Panel[] ps=new Panel[8];
		for(int i=0; i<ps.length; i++){
			ps[i]=new Panel();
			add(ps[i]);
		}
		////////////////////
		Label la1=new Label("ȸ������");
		Label la2=new Label("id");
		Label la3=new Label("pw");
		Label la4=new Label("�̸�");
		Label la5=new Label("���");
		Label la6=new Label("�з�");
		Label la7=new Label("�ڱ�Ұ�");
		
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox box1=new Checkbox("�",false,cbg);
		Checkbox box2=new Checkbox("����",false,cbg);
		Checkbox box3=new Checkbox("����",false,cbg);
		
		Choice cho=new Choice();
		cho.add("����");
		cho.add("�ʴ���");
		cho.add("����");
		cho.add("���п���");
		
		TextArea ta=new TextArea();
		////////////////////
		ps[0].add(la1);
		ps[1].add(la2);
		ps[1].add(tf1);
		ps[2].add(la3);
		ps[2].add(tf2);
		ps[3].add(la4);
		ps[3].add(tf3);
		ps[4].add(la5);
		ps[4].add(box1);
		ps[4].add(box2);
		ps[4].add(box3);
		ps[5].add(la6);
		ps[5].add(cho);
		ps[6].add(la7);
		ps[7].add(ta);
		///
		
		setBounds(200-1024,200,300,400);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Ex08();

	}

}
