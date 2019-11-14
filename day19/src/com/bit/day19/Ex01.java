package com.bit.day19;

import java.awt.FileDialog;
import java.awt.Frame;

public class Ex01{

	public static void main(String[] args) {
		Frame frame=new Frame("부모창");
		frame.setBounds(100-1024,100,500,400);
		frame.setVisible(true);
		
		///////////////
		FileDialog dia=new FileDialog(frame,"파일저장",FileDialog.SAVE);
//		Button btn=new Button();
//		dia.add(btn);
		dia.setLocation(150-1024, 150);
		dia.setSize(200, 200);
		dia.setVisible(true);
		System.out.println(dia.getDirectory());
		System.out.println(dia.getFile());
		
//		dia.dispose();//종료
	}

}
