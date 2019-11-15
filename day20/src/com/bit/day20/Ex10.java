package com.bit.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex10 {

	public static void main(String[] args) {
		String path=".\\imgs\\apple.jpg";

		File file=new File(path);
		File copy=new File("copy.jpg");
		
		InputStream is=null;
		OutputStream os=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		byte[] buf=new byte[1];
		try {
			is=new FileInputStream(file);
			os=new FileOutputStream(copy);
			bis=new BufferedInputStream(is);
			bos=new BufferedOutputStream(os);
			while(true){
				int su=bis.read(buf);
				if(su==-1){break;}
				bos.write(buf);
			}
			bos.flush();
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bos!=null)bos.close();
				if(bis!=null)bis.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}













