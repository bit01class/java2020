package com.bit.day11;

public class Ex08 {

	public static void main(String[] args) {
		// ����ó��
		int[] arr={1,2,3};
			try{
				for(int i=0; i<5; i++){
					int su=arr[i];
					System.out.println(su);
				}
			}catch( java.lang.ArrayIndexOutOfBoundsException e){
				System.out.println("����ȸ����");
			}
		System.out.println("���γ�");

	}

}
