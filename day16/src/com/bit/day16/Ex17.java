package com.bit.day16;

import java.util.Arrays;
import java.util.List;

public class Ex17 {

	public static void main(String[] args) {
		int[] arr1={1,3,6,23,7,5};
		int[] arr2={1,3,6,23,7,5};
		int[] arr3=new int[5];
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2));
//		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(arr1.toString());
		System.out.println("idx:"+Arrays.binarySearch(arr2, 5));
		System.out.println(java.util.Arrays.toString(arr1));
		List<Integer> list1 = Arrays.asList(1,3,5,7,9);
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		System.out.println("-----------------------");
		Arrays.fill(arr3, 100);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4=Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(arr4));
		int[] arr5=Arrays.copyOfRange(arr1, 2, arr1.length);
		System.out.println(Arrays.toString(arr5));
	}

}
















