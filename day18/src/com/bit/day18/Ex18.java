package com.bit.day18;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex18 extends Frame{
	
	public Ex18() {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		kit.beep();
		Dimension dim = kit.getScreenSize();
		
		File file=new File("C:\\Program Files (x86)\\Windows Media Player\\Media Renderer\\DMR_48.jpg");
		InputStream is=null;
		byte[] buf=new byte[(int) file.length()];
		try {
			is=new FileInputStream(file);
			is.read(buf);
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Image img=kit.createImage(buf);
		Icon icon=new ImageIcon(img);
		JButton btn=new JButton(icon);
		add(btn);
		setSize(400,500);
		setLocation(0+dim.width/2-this.getWidth()/2
				,0+dim.height/2-this.getHeight()/2);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex18();
	}

}










