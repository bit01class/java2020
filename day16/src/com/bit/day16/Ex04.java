package com.bit.day16;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {
	static Ex04 me;
	
	public static void func01(){
		System.out.println("my func01...");
	}

	public static void main(String[] args) {
		// System
		InputStream var2 = System.in;
		Scanner sc=new Scanner(var2);
		Ex04.me.func01();
		
		PrintStream var1 = System.out;
		var1.println("Ãâ·Â");
		var1.println("----------------------------------");
		long sec=System.currentTimeMillis();
		System.out.println(sec);
		System.out.println(Long.MAX_VALUE);
		var1.println("----------------------------------");
		Map<String,String> env = System.getenv();
		Set<String> keys = env.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			System.out.println(key+"="+env.get(key));
		}
	}

}












