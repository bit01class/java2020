package com.bit.day22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex03 {

	public static void main(String[] args) {
		java.net.InetAddress ia1=null;
		java.net.InetAddress ia2=null;
		java.net.InetAddress ia3=null;
		InetAddress[] arr=null;

		try {
//			ia1=InetAddress.getByName("daum.net");
//			ia2=InetAddress.getLocalHost();
			byte[] by=new byte[]{125,(byte)209,(byte)222,(byte)141};
			ia3=InetAddress.getByAddress(by);
			
			arr=InetAddress.getAllByName("www.naver.com");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<arr.length; i++){
			InetAddress temp = arr[i];
			System.out.println(temp.getHostAddress());
			System.out.println(temp.getHostName());
		}
		
//		System.out.println(ia3.getHostName());
//		System.out.println(ia3.getHostAddress());
//		System.out.println(ia3.getCanonicalHostName());
	}
	
//	naver.com
//	125.209.222.141
//	125.209.222.141
	////////////////
//	210.89.164.90
//	125.209.222.141
//	210.89.160.88
//	125.209.222.142
	//////////////
//	210.89.164.90
//	www.naver.com
//	210.89.160.88
//	www.naver.com

}
