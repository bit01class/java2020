package com.bit.day17;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		File file;
		file=new File("newName.bin");
		
		if(file.delete()){
			System.out.println("delete");
		}
	}

}
