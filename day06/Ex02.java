class Ex02{

 public static void main(String[] args){
	func1();
	// 클래스명 변수명 = new 클래스명();
	// 클래스명-해당 non-static 메서드를 
	// 		가지고 있는 클래스 이름
	// 변수명 - 참조변수
	// 실행 - 참조변수명.메서드명
	Ex02 me = new Ex02();
	me.func2();
 }

 // static 메서드, 클래스 메서드
 public static void func1(){
	System.out.println("func1 기능수행");
	return;
 }
 
 // non-static 메서드, 맴버 메서드, 객체 메서드
 public void func2(){
	System.out.println("func2 기능수행");
	return ;
 }

}