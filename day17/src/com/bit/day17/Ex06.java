package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		File file;
		try {
			file=File.createTempFile("abcdefg", ".bit");
			System.out.println("�ӽ����ϻ���");
			System.out.println(file.exists());
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
