class Ex03{
// 호출
// static - static -> 메서드명(...)
// static - non-static -> 참조변수.메서드명(...)
// non-static - non-static -> 메서드명(...)
// non-static - static -> 메서드명(...)

 public static void main(String[] args){
	func2();
	//Ex03 me = new Ex03();
	//me.func3();
	//Ex03 me2= new Ex03();
	//me2.func4();
	//me.func4();
 }

 public static void func1(){
	System.out.println("func1()...");
 }

 public static void func2(){
	Ex03 you=new Ex03();
	you.func4();
	System.out.println("func2()...");
 }

 public void func3(){
	//func4();
	//func2();
	System.out.println("func3()...");
 }

 public void func4(){
	System.out.println("func4()...");
 }

}