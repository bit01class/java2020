package com.bit.day16;

public class Ex05 {

	public static void main(String[] args) {
		int[] source ={1,3,5,7,8,9,13,23,45,67,89,90};
//		int[] source ={5,7,8,9,13};
		int[] target =new int[5];
		
		// 
//		for(int i=0; i<target.length; i++){
//			target[i]=source[i];
//		}
//		System.arraycopy(source, 0, target, 0, target.length);
		System.arraycopy(source,2,target,2,5);
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		
		source[3]=6;
		for(int i=0; i<target.length; i++){
			System.out.println(target[i]);
		}
	}

}











