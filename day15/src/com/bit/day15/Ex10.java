package com.bit.day15;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Ex10 {

	public static void main(String[] args) throws ParseException {
		Vector vec=new Vector();
		vec.add(3333);
		vec.add(2222);
		vec.add(4444);
		vec.add(1111);
		vec.add(5555);
		
		class Ex00 implements Comparator<Integer>{
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
//				return o1-o2;
			}
		}
		
		vec.sort(new Ex00());
		
		java.util.List list=vec.subList(1, 3);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		
//		Enumeration eles = vec.elements();
//		while(eles.hasMoreElements()){
//			System.out.println(eles.nextElement());
//		}

	}
	
}
