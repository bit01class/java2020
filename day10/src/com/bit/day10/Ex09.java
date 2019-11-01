package com.bit.day10;

public class Ex09 {

	public static void main(String[] args) {
		int[] arr={9,7,5,1,3};
//					9	7
//					9	5
		int temp=0;
		for(int i=0; i<arr.length-1; i++){
			for(int j=1+i; j<arr.length; j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		

	}

}
