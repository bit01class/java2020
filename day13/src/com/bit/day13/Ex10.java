package com.bit.day13;

public class Ex10 {
	public static void func04(){
		System.out.println("f4...");
	}
	public static void func01(final int a){
		// ~jdk1.7 상수형 변수만 허용
		// jdk1.8
		final int b=2222;
		class Local01{
			int su1=1111;
//			static final int su2=2222;
			public Local01() {
				System.out.println("new Local class...");
			}
			
			public void func03(){
				System.out.println(b+"local func03...");
				func04();
			}
		}// Local end
		Local01 lo1=new Local01();
		System.out.println(lo1.su1);
		lo1.func03();
	} // func01 end;
	
	public void func02(){
		class local02{
		}
	}

	public static void main(String[] args) {
		//로컬클래스
		Ex10.func01(1234);
		Ex10.func01(1111);
	}

}
