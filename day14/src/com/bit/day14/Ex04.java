package com.bit.day14;

import java.util.LinkedList;

public class Ex04 {

	public static void main(String[] args) {
		// list
		java.util.LinkedList list;
		list=new LinkedList();
		list.add(1111);
		list.add(2222);
		list.clear();
		list.add(3333);
		list.add(4444);
		list.add(3333);
		
		for(int i=0; i<list.size(); i++){
			//unboxing
			System.out.println(list.get(i));
		}
		

	}

}
