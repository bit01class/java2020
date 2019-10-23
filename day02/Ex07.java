class Ex07{
	public static void main(String[] args){

	// 문자형 변수

	char ch;
	ch='A';
	System.out.println("ch="+ch);
	ch='\uac01';
	System.out.println("ch="+ch);
	ch='ㄱ';
	System.out.println("ch="+ch);
	ch='1';
	System.out.println("ch="+(int)ch);
	ch='\\';
	System.out.println("ch="+ch);

	// 문자열
	String st="문자열은 \n\"내용\"안에 작성";
	System.out.println(st);
	st="PATH=\"C:\\Program Files\\Java\\jdk1.8.0_231\\bin\"";
	System.out.println(st);
	}// main end
}// class end














