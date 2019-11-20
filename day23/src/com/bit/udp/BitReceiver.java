package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class BitReceiver {

	public static void main(String[] args) {
		byte[] buf=new byte[12];
		DatagramSocket sock=null;
		DatagramPacket dgp=null;
		try {
			sock=new DatagramSocket(5000);
			dgp=new DatagramPacket(buf, 6);
			sock.receive(dgp);
			byte[] data = dgp.getData();
			System.out.println(Arrays.toString(data));
			System.out.println(new String(data));
			dgp=new DatagramPacket(buf, 6);
			sock.receive(dgp);
			data = dgp.getData();
			System.out.println(Arrays.toString(data));
			System.out.println(new String(data));
			dgp=new DatagramPacket(buf, 6);
			sock.receive(dgp);
			data = dgp.getData();
			System.out.println(Arrays.toString(data));
			System.out.println(new String(data));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(sock!=null)sock.close();
		}

	}

}















