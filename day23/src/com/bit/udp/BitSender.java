package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class BitSender {

	public static void main(String[] args) {
		byte[] ip=new byte[]{(byte)192,(byte)168,1,31};
		int port=5000;
		String msg="Hello UDP...";
		DatagramSocket sock=null;
		DatagramPacket packet=null;
		try {
			InetAddress addr=InetAddress.getByAddress(ip);
			sock=new DatagramSocket();
			packet=new DatagramPacket(msg.getBytes()
									,msg.length(),addr,port);
			sock.send(packet);
			msg="12자단위발송";
			packet=new DatagramPacket(msg.getBytes()
									,12,addr,port);
			sock.send(packet);
			msg="머라고보낼까";
			packet=new DatagramPacket(msg.getBytes()
									,12,addr,port);
			sock.send(packet);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(sock!=null)sock.close();
		}

	}

}













