package com.bit.day22;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex05 {

	public static void main(String[] args) {
		File file = new File("index.html");
		String path="https://www.naver.com/";
		URL url=null;
		URLConnection conn =null;
		InputStream is = null;
		OutputStream os=null;
		try {
			url=new URL(path);
			conn = url.openConnection();
			conn.connect(); //접속
			is = conn.getInputStream();
			os=new FileOutputStream(file);
			while(true){
				int su=is.read();
				if(su==-1){break;}
				os.write(su);
			}
			System.out.println("긁어오기 완료");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}



















