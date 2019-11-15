package com.bit.day20;

import java.io.IOException;
import java.io.InputStream;

public class Ex03 {

	public static void main(String[] args) {
		InputStream inn = System.in;
		int su=-1;
		try {
			while(true){
				su=inn.read();
				if(su==-1){break;}
				System.out.println(su);
			}
		} catch (IOException e) {
				e.printStackTrace();
		}

	}

}
