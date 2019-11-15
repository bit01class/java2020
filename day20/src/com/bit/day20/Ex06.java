package com.bit.day20;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex06 {

	public static void main(String[] args) {
		String path="test02.bin";
		File file =new File(path);
		
		InputStream is=null;
		DataInputStream dis=null;
		
		try {
			is=new FileInputStream(file);
			dis=new DataInputStream(is);
			
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt()+1);
			System.out.println(dis.readDouble()+1.0);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dis!=null)dis.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}















