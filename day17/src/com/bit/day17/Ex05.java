package com.bit.day17;

import java.io.File;

public class Ex05 {

	public static void main(String[] args) {
		File file;
		file=new File("test01.bin");
		
		File file2;
		file2=new File("newName2.bin");
		if(file2.renameTo(file)){
			System.out.println("¿Ã∏ßπŸ≤ﬁ");
		}
	}

}
