class Ex01{
/*
class 클래스명{}
클래스명 
- 첫글자 숫자 특수문자 불가 (예외 _$)
- 첫글자가 대문자로 시작
- 두개이상의 단어사용시 
	두번째 단어의 첫글자를 대문자
- 동일 패키지상의 클래스는 이름중복이 불가

- 클래스의 구성요소
	1. 메서드
*/
  public static void func1(){
	System.out.println("메서드1");
	func2();
	System.out.println("메서드1끝");
  }

  public static void main(String[] args){
	System.out.println("시작");
	func1();
	System.out.println("끝");
  }
	// 메서드
	// 메서드명 중복 불가(메서드 오버로드 예외)
	// public static 자료형 메서드명([매개변수])
	// 메서드의 호출은
	// 인자유무, 인자갯수, 인자타입 일치 호출가능


  public static void func2(){
	System.out.println("메서드2");
	return;
  }

} // class end












