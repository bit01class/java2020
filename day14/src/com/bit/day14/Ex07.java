package com.bit.day14;

public class Ex07 {

	public static void main(String[] args) {
		// ���� ����(����o)list
		// ���� ����(����x)set
		// ���Լ���
		java.util.Queue que=null;
		que=new java.util.LinkedList();
		
		que.offer("ù��°");
		que.offer("�ι�°");
		que.offer("����°");
		que.offer("�׹�°");
		que.offer("�ټ���°");
		
		while(que.peek()!=null){
		System.out.println(que.poll());
		}
	}

}
