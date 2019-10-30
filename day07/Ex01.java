class Ex01{

 public static void main(String[] args){
	func1();
	Ex11.func1();
	
	Ex11 me=new Ex11();
	me.func2();	
	//me.func1();
 }// main end

 // static 메서드(method)	
 public static void func1(){
	System.out.println("Ex01 static func1...");
 } // f1 end

 // non-static 메서드 
 public void func2(){
	System.out.println("Ex01 non-static func2...");
 } // f2 end


} // class end

class Ex11{
 public static void func1(){
	System.out.println("Ex11 static func1...");
 } // f1 end

 // non-static 메서드 
 public void func2(){
	System.out.println("Ex11 non-static func2...");
 } // f2 end 

 public static void main(String[] args){
	System.out.println("Ex11 main...");
 } // main end
} // class end






