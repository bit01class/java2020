package com.bit.day22;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex04 {

	public static void main(String[] args) {
		String msg="http://www.seoul.go.kr:80/main/index.jsp";
		java.net.URL url=null;
		
		try {
			url=new URL(msg);
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort()+" or "+url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}







