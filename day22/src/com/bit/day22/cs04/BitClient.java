package com.bit.day22.cs04;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class BitClient extends Frame implements ActionListener{
	TextField tf;
	TextArea ta;
	OutputStream os;

	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText()+"\n";
		try {
			os.write(msg.getBytes());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		tf.setText("");
		tf.setText("");
	}
	
	public BitClient() {
		setLayout(new BorderLayout());
		tf=new TextField();
		
		tf.addActionListener(this);
		ta=new TextArea();
		add(tf,BorderLayout.SOUTH);
		add(ta,BorderLayout.CENTER);
		setBounds(100-1024,100,300,400);
		setVisible(true);
		
		String ip="192.168.1.31";
		int port=5000;
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			sock=new Socket(ip,port);
			os=sock.getOutputStream();
			
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while(true){
				String msg=br.readLine();
				ta.setText(ta.getText()+"\n"+msg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		new BitClient();
		
	}

}
