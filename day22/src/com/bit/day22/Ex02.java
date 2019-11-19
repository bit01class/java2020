package com.bit.day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		InputStream is=null;
		java.util.Scanner sc=null;
		// inputstream
		sc=new Scanner(System.in);
		System.out.println(sc.nextLine());
		try{
		System.out.println(sc.nextInt());
		} catch(java.util.InputMismatchException e){
			System.out.println("회피");
//			System.out.println(sc.nextLine());
			sc=new Scanner(System.in);
		}
		try{
			System.out.println(sc.nextInt());
		} catch(java.util.InputMismatchException e){
			System.out.println("회피");
		}
		System.out.println(sc.nextLine());
		
//		try {
//			is=new FileInputStream(file);
//			sc=new Scanner(is);
//			System.out.println(sc.nextInt()+1);
//			System.out.println(sc.nextInt()+1);
//			System.out.println(sc.nextLine());
//			System.out.println(sc.nextLine());
//			System.out.println(sc.nextInt()+1);
//			
//		} catch (FileNotFoundException e) {
////			e.printStackTrace();
//		} catch(java.util.InputMismatchException e){
//			System.out.println("회피");
//		}

	}

}




