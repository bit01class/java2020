package com.bit.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex14 {

	public static void main(String[] args) {
		// ����
		// \r
		// \n
		// \r\n
		
		String msg="�̷��� �ۼ��� �� �ֽ��ϴ�\r\n1234\r\nabcd";
		File file;
		file=new File("test01.bin");
		
		OutputStream os;
		byte[] buff = msg.getBytes();
		try {
			os=new FileOutputStream(file);
			
			os.write(buff);
			
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
