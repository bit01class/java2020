package com.bit.day19;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex09 extends Frame implements ItemListener {
	Label la;
	Choice cho;
	List list;
	Checkbox box1,box2;
	
	public Ex09() {
		Panel p=new Panel();
		
		cho=new Choice();
		cho.add("item1");
		cho.add("item2");
		cho.add("item3");
		cho.add("item4");
		
		cho.addItemListener(new ItemListener(){

			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		p.add(cho);
		
		la=new Label("          ");
		p.add(la);
		
		list=new List();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.addItemListener(this);
		p.add(list);
		
		CheckboxGroup cbg=new CheckboxGroup();
		box1=new Checkbox("check1",true,cbg);
		box2=new Checkbox("check2",false,cbg);
		
		box1.addItemListener(this);
		box2.addItemListener(this);
		
		p.add(box1);
		p.add(box2);
		
		add(p);
		setBounds(100-1024,100,400,300);
		setVisible(true);
		System.out.println(cho.getSelectedIndex());
		System.out.println(cho.getSelectedItem());
	}

	public static void main(String[] args) {
		new Ex09();
	}

	public void itemStateChanged(ItemEvent e) {
		System.out.println("상태변경");
		Object obj=e.getSource();
		if(obj==cho){
			Choice temp=(Choice) obj;
			la.setText(temp.getSelectedItem());
		}else if(obj==list){
			List temp=(List) obj;
			la.setText(temp.getSelectedItem());
		}else{
			if(box1.getState()){
				la.setText(box1.getLabel());
			}
			if(box2.getState()){
				la.setText(box2.getLabel());
			}
		}
	}

}
