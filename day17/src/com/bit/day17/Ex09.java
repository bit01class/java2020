package com.bit.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		File file;
		file=new File("test01.bin");
		
		java.io.InputStream is;
		byte[] buf=new byte[4];
		int cnt=0;
		try {
			is=new FileInputStream(file);
			while(true){
				int su=is.read();
				if(su==-1){break;}
				buf[cnt++]=(byte)su;
			}
			System.out.println(Arrays.toString(buf));
			System.out.println(new String(buf));
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}











