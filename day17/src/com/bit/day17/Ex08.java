package com.bit.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class Ex08 {

	public static void main(String[] args) {
		// io 
		File file;
		file=new File("test01.bin");
		
		java.io.OutputStream os;
		// 1byte
		byte[] by="�ѱ�".getBytes();
		try {
			os=new java.io.FileOutputStream(file);
			for(int i=0; i<by.length; i++){
				os.write(by[i]);
			}
			os.close();
			System.out.println("�ۼ��Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}













