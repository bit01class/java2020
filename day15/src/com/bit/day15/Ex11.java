package com.bit.day15;

import java.util.HashMap;

public class Ex11 {

	public static void main(String[] args) {
		// Map
		java.util.Map<String,String> map=new HashMap<String,String>(); 

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value1");
		
//		map.put('a', 12234);
//		map.put(3.14, true);
//		map.put(null, 12234);
		map.put(null, "¹Ù²Þ");
		
		System.out.println(map.get("¾øÀ½"));
	}

}


















