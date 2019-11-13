package com.bit.day17;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		// file
		// 경로(상대,절대)
		java.io.File file1=null;
		file1=new File(".\\..");
		
		System.out.println("존재하는지?"+file1.exists());
		System.out.println("디렉토리인지?"+file1.isDirectory());
		System.out.println("파일인지?"+file1.isFile());
		System.out.println("경로?"+file1.getPath());
		System.out.println("절대경로?"+file1.getAbsoluteFile());
		
		try {
			System.out.println("절대경로?"+file1.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("이름?"+file1.getName());
		System.out.println("상위경로?"+file1.getParent());
		System.out.println("r읽기권한?"+file1.canRead());
		System.out.println("w쓰기권한?"+file1.canWrite());
		System.out.println("x실행권한?"+file1.canExecute());
		System.out.println(file1.length()+"byte");
		System.out.println(new Date(file1.lastModified()));
		String[] msg = file1.list();
		System.out.println(Arrays.toString(msg));
	}

}







