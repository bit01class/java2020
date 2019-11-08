package com.bit.day15;

import java.util.Vector;

public class Ex09 {

	public static void main(String[] args) {
		Vector vec1= new Vector(3,2);
		for(int i=0; i<6; i++){
			vec1.add(i);
		}
		vec1.trimToSize();
		System.out.println(vec1.capacity());
		
//		Vector vec2=vec1;
//		Vector vec2=new Vector(vec1);
//		vec1.add(1111);
		
		Vector vec2=new Vector();
		vec2.add(1234);
		vec2.addAll(vec1);
		
		for(int i=0; i<vec2.size(); i++){
			System.out.println(vec2.elementAt(i));
		}
		
	}

}










