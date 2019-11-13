package com.bit.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex11 {

	public static void main(String[] args) {
		File img;
		img=new File("imgs\\coff.jpg");
		System.out.println(img.exists());
		System.out.println(img.length());
		
		File copy;
		copy=new File("copy\\copyCoff.jpg");
		copy.delete();
		
		InputStream is;
		OutputStream os;
		byte[] buff=new byte[9];
		try {
			if(copy.createNewFile()){
				is=new FileInputStream(img);
				os=new FileOutputStream(copy);
				
				while(true){
					int su=is.read(buff);
					System.out.println(su);
					if(su==-1){break;}
					os.write(buff);
				}
				System.out.println("복사완료");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







