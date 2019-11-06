package com.bit.day13;

interface Inter{
	void func01();
}
interface Inter02{
	void func02();
	void func03();
}

abstract class Cl11{
	void func04(){}
	abstract void func05();
}

public class Ex11 {
	public static final int su1=111;
	public static final String msg="약오르지";
	public static final String msg2=new String("약오르지");
	
	public static final Object obj2=new Object(){
		public String toString() {
			return "어노니머스";
		}
	};
	
	
	public static Inter func(){
		
		
		Inter local=new  Inter ()  {
			public void func01(){
				System.out.println("Local func01...");
			}
		};
		
		return local;
	}// func end

	public static void main(String[] args) {
		// 
		Inter obj=func();
		obj.func01();
		
		Inter02 ele2 = new Inter02(){

			public void func02() {
				
			}
			public void func03() {
				
			}
			
		};
		
		
		Cl11 cl = new Cl11(){
			void func05() {
				
			}
			
		};
		
		
		System.out.println(obj2);
	}

}











