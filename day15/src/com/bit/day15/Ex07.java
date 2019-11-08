package com.bit.day15;

import java.util.Enumeration;
import java.util.Vector;

public class Ex07 {

	public static void main(String[] args) {
		Vector<String> vec1=new Vector<>();
		
		vec1.addElement("ÇÏ³ª");
		vec1.addElement("µÎ¿ï");
		vec1.addElement("¼¼¿§");
		vec1.addElement("³×¿§");
		vec1.addElement("µÎ¿ï");

		Enumeration<String> eles = vec1.elements();
		while(eles.hasMoreElements()){
			String ele = eles.nextElement();
			System.out.println(ele);
		}
		System.out.println("-------------------");
		vec1.add("¿©¼¸");
		vec1.add("ÀÏ°ö");
		for(int i=0; i<vec1.size(); i++){
			String msg=vec1.elementAt(i);
			System.out.println(msg);
		}
	}

}















