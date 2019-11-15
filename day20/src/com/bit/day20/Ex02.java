package com.bit.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String path="test01.txt";
		
		File file=new File(path);
		
		InputStream is=null;
		byte[] buf=new byte[20];
		try {
			is=new FileInputStream(file);
			while(true){
				int su=is.read(buf);
				if(su==-1){break;}
				System.out.write(buf,0,su);
			}
		} catch (FileNotFoundException e) {
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
















