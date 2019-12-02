package com.bit.day24;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer extends Thread {
	Socket sock;
	static String msg="<h1>Hello My Web Site</h1>";
	
	public void run() {
		
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		OutputStream os=null;
		DataOutputStream dos=null;
		FileInputStream fis=null;
		try {
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String req=br.readLine();
			String[] temp=req.split(" ");
			req=temp[1];
			if(req.equals("/"))req="/index.html";
			File file=new File("www"+req);
			
			fis=new FileInputStream(file);
			os=sock.getOutputStream();
			dos=new DataOutputStream(os);
			
			dos.writeBytes("HTTP/1.1 200 OK \r\n");
			dos.writeBytes("Content-type: text/html; charset=utf-8 \r\n");
			dos.writeBytes("\r\n");
			while(true){
				int su=fis.read();
				if(su==-1)break;
				dos.writeByte(su);
			}
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dos!=null)dos.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ServerSocket serve=null;
		Socket sock=null;
		OutputStream os=null;
		DataOutputStream dos=null;
		
		
		try {
			
			serve=new ServerSocket(80);
			
			while(true){
				MyWebServer my=new MyWebServer();
				my.sock =serve.accept();
				my.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(serve!=null)serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
//		try {
//			serve=new ServerSocket(80);
//			sock=serve.accept();
//			InetAddress addr = sock.getInetAddress();
//			String ip=addr.getHostAddress();
//			System.out.println(ip+"님 접속되었습니다");
//			
//			os=sock.getOutputStream();
//			dos=new DataOutputStream(os);
////			dos.writeBytes("HTTP/1.1 404 Not Found \r\n");
////			dos.writeBytes("HTTP/1.1 500 Internal Server Error \r\n");
//			dos.writeBytes("HTTP/1.1 200 OK \r\n");
//			dos.writeBytes("Content-type: text/html;charset=utf-8 \r\n");
//			dos.writeBytes("\r\n");
//			os.write(msg.getBytes());
//			os.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally{
//			try {
//				if(os!=null)os.close();
//				if(sock!=null)sock.close();
//				if(serve!=null)serve.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

	}

}
