package com.bit.day15;

class MyArray{
	int[] arr;
	int cnt;
	
	public MyArray() {
		arr=new int[5];
	}
	public void add(int su){
		if(arr.length<cnt){
			int[] temp=arr;
			arr=new int[arr.length+10];
			for(int i=0; i<temp.length; i++){
				arr[i]=temp[i];
			}			
		}
		arr[cnt]=su;
		cnt++;
	}
	public int size(){return cnt;}
	public int get(int idx){
		return arr[idx];
	}
}

public class Ex08 {

	public static void main(String[] args) throws Exception {
		MyArray list=new MyArray();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(5555);
		list.add(6666);
		
		for(int i=0; i<=list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}







