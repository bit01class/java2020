package com.bit.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex09 {

	public static void main(String[] args) {
		String msg="abcdefg 1234567890";
		String path="test04.txt";
		File file =new File(path);
		
		OutputStream os=null;
		BufferedOutputStream bos=null;
		
		try {
			os=new FileOutputStream(file);
			bos=new BufferedOutputStream(os);
			for(int i=0; i<msg.length(); i++){
				bos.write(msg.charAt(i));
			}
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bos!=null)bos.close();
				if(os!=null)os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}













