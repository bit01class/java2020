package com.bit.day20;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex05 {

	public static void main(String[] args) {
		// Data stream
		String path="test02.bin";
		File file = new File(path);
		
		java.io.OutputStream os=null;
		java.io.DataOutputStream dos=null;
		
		int su1=1234;
		double su2=3.14;
		char ch='@';
		boolean boo=true;
		String msg="¹®ÀÚ¿­";
		
		try {
			os=new FileOutputStream(file);
			dos=new DataOutputStream(os);
			
			dos.write(65);
			dos.writeInt(su1);
			dos.writeDouble(su2);
			dos.writeChar(ch);
			dos.writeBoolean(boo);
			dos.writeUTF(msg);
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dos!=null)dos.close();
				if(os!=null)os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}














