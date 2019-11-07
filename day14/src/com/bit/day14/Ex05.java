package com.bit.day14;

public class Ex05 {

	public static void main(String[] args) {
		java.util.List list=null;
//		list=new java.util.ArrayList();
		list=new java.util.LinkedList();
		long start=System.currentTimeMillis();
		for(int i=0; i<9999999; i++){
			list.add(i);
		}
		long end=System.currentTimeMillis();
		System.out.println("ÀÔ·Â³¡:"+(end-start));
	}

}
