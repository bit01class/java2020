package com.bit.day16;

public class Ex02 {

	public static void main(String[] args) {
		String msg="javaWeb";
		char[] chs=msg.toCharArray();
		StringBuilder build1=new StringBuilder("¹®ÀÚ¿­");
		StringBuffer buf1=new StringBuffer(build1);
		System.out.println(buf1);
		for(int i=0; i<16; i++){
			buf1.append('a');
//			buf1.trimToSize();
			System.out.print(buf1.length()+":");
			System.out.println(buf1.capacity());
		}

	}

}
