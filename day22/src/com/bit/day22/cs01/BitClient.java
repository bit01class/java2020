package com.bit.day22.cs01;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class BitClient {

	public static void main(String[] args) {
		String ip="192.168.1.31";
		int port=5000;
		
		java.net.Socket sock=null;
		InputStream is=null;
		try {
			sock=new Socket(ip,port);
			is=sock.getInputStream();
			while(true){
				int su=is.read();
				if(su==-1){break;}
				System.out.write(su);
				System.out.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}















