package com.bit.day14;

interface MyStack{
	void add(int val);
	int pull();
	int size();
}

interface MyQueue{
	void add(int val);
	int pop();
	int size();
}

class MyArrayList implements MyStack, MyQueue{
	// Ä¸½¶È­(Á¤º¸ÀÇÀº´Ð)
	private int[] arr;
	
	public MyArrayList() {
		arr=new int[]{};
	}
	
	public void add(int val){
		int[] temp=arr;
		arr=new int[arr.length+1];
		for(int i=0; i<temp.length; i++){
			arr[i]=temp[i];
		}
		arr[arr.length-1]=val;
	}
	
	public int size(){
		return arr.length;
	}
	
	public int get(int idx){
		return arr[idx];
	}
	
	public int pull(){
		int result=arr[0];
		
		int[] temp=arr;
		arr=new int[arr.length-1];
		for(int i=0; i<arr.length; i++){
			arr[i]=temp[i+1];
		}
		return result;
	}
	
	public int pop(){
		int su=arr.length-1;
		int result=arr[su];
		int[] temp=arr;
		arr=new int[su];
		for(int i=0; i<arr.length; i++){
			arr[i]=temp[i];
		}
		return result;
	}
}


public class Ex01 {

	public static void main(String[] args) {
		MyQueue list=new MyArrayList();
		list.add(123);
		list.add(25455);
		list.add(343);
		list.add(4232);
		list.add(5242);
		
		while(list.size()!=0){
			System.out.println(list.pop());
		}
	}

}











