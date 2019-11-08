package com.bit.day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex12 {
	
	public static void main(String[] args) {
		Map<String,Integer> map;
		map=new HashMap<String,Integer>();

		for(int i=0; i<5; i++){
			map.put("key"+i, i);
		}
		map.put("key1", null);
		map.remove("key1");
		
		java.util.Set<String> keys=map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("----------------------");
		Set<Entry<String, Integer>> entrys;
		entrys= map.entrySet();
		Iterator<Entry<String, Integer>> ite2;
		ite2= entrys.iterator();
		while(ite2.hasNext()){
			Entry<String, Integer> entry = ite2.next();
			System.out.print(entry.getKey()+":");
			System.out.println(entry.getValue());
		}
		System.out.println("----------------------");
		Set keys2=map.keySet();
		List<String> list=new ArrayList<>(keys2);
		for(int i=0; i<list.size(); i++){
			String key=list.get(i);
			System.out.println(key+":"+map.get(key));
		}
		
	}

}


















