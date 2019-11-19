package com.bit.day22.cs02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BitServer {

	public static void main(String[] args) {
		ServerSocket serve=null;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		PrintStream ps=null;
		try {
			serve=new ServerSocket(5000);
			System.out.println("대기중...");
			sock=serve.accept();
			InetAddress addr = sock.getInetAddress();
			System.out.println(addr.getHostAddress()+"접속됨");
			
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			while(true){
				String msg=br.readLine();
				if(msg==null){break;}
				ps.println(">>>"+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(ps!=null)ps.close();
				if(isr!=null)isr.close();
				if(br!=null)br.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
				if(serve!=null)serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}









