package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		String path=".\\test01.txt";
		File file=new File(path);
		
		OutputStream os=null;
		byte[] buf=new byte[20];
		try {
			os=new FileOutputStream(file);
			System.out.print(">>>");
			int su=System.in.read(buf);
			os.write(buf,0,su);
			os.flush();
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}


















