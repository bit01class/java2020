package com.bit.day22.cs01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BitServer {

	public static void main(String[] args) {
		java.net.ServerSocket serv=null;
		// port 2000�̳� ������
		String msg="Hello My server...";
		OutputStream os = null;
		Socket sock = null;
		try {
			serv=new ServerSocket(5000);
			System.out.println("Ŭ���̾�Ʈ ���Ӵ�� ��...");
			sock = serv.accept();
			InetAddress addr = sock.getInetAddress();
			System.out.print(addr.getHostAddress());
			System.out.println("Ŭ���̾�Ʈ ���ӵ�");
			os = sock.getOutputStream();
			os.write(msg.getBytes());
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null)os.close();
				if(sock!=null)sock.close();
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}













