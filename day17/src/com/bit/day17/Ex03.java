package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File file;
		file=new File("newName2.bin");

		try {
			if(file.createNewFile()){
					System.out.println("���ϻ���");
			}else{
				System.out.println("������ ������");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
