package com.bit.day15;

public class Ex01 {

	public static void main(String[] args) {
		// ���׸�
		java.util.List<String> list=null;
		list=new java.util.ArrayList<String>();

		list.add("�ϳ�");
		list.add("�ο�");
//		list.add(new Integer(3333));
		list.add("����");
		list.add("�׿�");
		
		for(int i=0; i<list.size(); i++){
			String obj = (String)list.get(i);
			System.out.println(obj);
		}
	}

}










