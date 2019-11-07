package com.bit.day14;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		// List
		java.util.ArrayList list;
		list=new ArrayList();
		// auto boxing
		list.add(1111);
		list.add(2222);
//		list.clear();
		list.add(3333);
		list.add(4444);
		list.add(3333);
		
		ArrayList list2 = (ArrayList)list.clone();
		
		list.add(1,5555);
		list.add(list.size(),6666);
		list2.add(1, "ÇÑ±Û");
		list2.remove(new Integer(2222));
		list2.set(1, 9999);
		for(int i=0; i<list2.size(); i++){
			//unboxing
			System.out.println(list2.get(i));
		}
		
		System.out.println(list.contains(5555));
		System.out.println(list.indexOf(3333));
		System.out.println(list.lastIndexOf(3333));
		System.out.println(list.isEmpty());
		ArrayList list3=new ArrayList();
		System.out.println(list3.isEmpty());
		Object[] arr =list2.toArray();
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}











