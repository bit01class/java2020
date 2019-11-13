package com.bit.day18;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;




public class Ex17 {

	public static void main(String[] args) {
		Frame frame=new Frame("제목있음");
		
		Panel p=new Panel();
		
		
		Menu mn1=new Menu();
		mn1.setLabel("File");
		
		MenuItem mni1=new CheckboxMenuItem("Mode",true);
		MenuItem mni2=new Menu("상위메뉴");
		Menu mn2=new Menu("Edit");
		mn2.add(mni1);
		mn2.add(mni2);
		
		MenuItem mnItem1=new MenuItem();
		mnItem1.setLabel("Welcome");
		MenuItem mnItem2=new MenuItem("About");
		
		Menu mn3=new Menu("Help");
		mn3.add(mnItem1);
		mn3.addSeparator();
		mn3.add(mnItem2);
		
		MenuBar mb=new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		mb.add(mn3);
		
		frame.setMenuBar(mb);
		frame.add(p);
//		frame.setTitle("제목없음");
		frame.setSize(400, 300);
		frame.setLocation(100-1024, 100);
		frame.setVisible(true);
		System.out.println(p.getWidth());
		System.out.println(p.getHeight());
	}

}
