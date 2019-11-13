package com.bit.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex12 {

	public static void main(String[] args) {
		File file;
		file=new File("test01.bin");
		
		InputStream is;
		byte[] buff=new byte[20];
		String printMsg="";
		try {
			is=new FileInputStream(file);
			while(true){
				int su=is.read(buff);
				if(su==-1){break;}
				printMsg+=new String(buff);
			}
			System.out.println(printMsg);
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}















