package com.bit.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		InputStream is=null;
		try {
			is=new FileInputStream(file);
			Scanner sc=new Scanner(is);
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextInt()+1);
			
			
		} catch (FileNotFoundException e) {
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
