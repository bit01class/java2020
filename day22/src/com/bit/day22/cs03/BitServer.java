package com.bit.day22.cs03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BitServer extends Thread{
	Socket sock;
	
	public void run() {
		InputStream is=null;
		OutputStream os=null;
		
		PrintStream ps=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			while(true){
				String msg=br.readLine();
				if(msg==null)break;
				ps.println(msg);
			}
			
		} catch (IOException e) {
//			e.printStackTrace();
		} finally{
			try {
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		ServerSocket serve=null;
		try {
			serve=new ServerSocket(5000);
			while(true){
				Socket sock = serve.accept();
				InetAddress addr = sock.getInetAddress();
				System.out.println(addr.getHostAddress()
									+"´Ô Á¢¼ÓÇÏ¼Ì½À´Ï´Ù");
				BitServer thr=new BitServer();
				thr.sock=sock;
				thr.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(serve!=null)serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
