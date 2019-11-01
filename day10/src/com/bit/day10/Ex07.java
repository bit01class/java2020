package com.bit.day10;

public class Ex07 {
	
	public static void func1(int[] arr){
		for(int i=0; i<arr.length; i++){
			if(i==1){arr[i]=100;}
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// 배열
		int[] arr1={1,3,5,7,9};
		int[] arr2=null;
		arr2=new int[]{1,3,5,7,9};
		int[] arr3;
		arr3=new int[5];
//		arr1[0]=1;
//		arr1[1]=3;
//		arr1[2]=5;
//		arr1[3]=7;
//		arr1[4]=9;
		// 배열의 옅은복사
//		int[] arr4=arr1;
		// 배열의 깊은복사
		int[] arr4=new int[arr1.length];
		for(int i=0; i<arr4.length; i++){
			arr4[i]=arr1[i];
		}
		
		System.out.println(arr1);
		System.out.println(arr2);
		for(int i=0; i<arr4.length; i++){
			System.out.println(arr4[i]);
		}
		System.out.println(arr1==arr4);
		System.out.println("--------------------------");
		func1(arr1);
		System.out.println("--------------------------");
		for(int i=0; i<arr4.length; i++){
			System.out.println(arr4[i]);
		}
	}

}
















