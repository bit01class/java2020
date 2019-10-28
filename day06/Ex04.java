class Ex04{

 public static void main(String[] args){
	int a,b,c,result;
	result=0;
	a=5;
	b=2;
	c=2;
	char ch='?';

	java.util.Scanner abc
	=new java.util.Scanner(System.in);
	System.out.print("첫번째:");
	a=abc.nextInt();
	System.out.print("두번째:");
	b=abc.nextInt();
	System.out.print("1.더하기 2.빼기 3.곱하기 4.나누기:");
	c=abc.nextInt();

	Ex04 me = new Ex04();

	switch(c){
		case 1:
		me.plus(a,b);
		ch='+';
		break;
		case 2:
		me.minus(a,b);
		ch='-';
		break;
		case 3:
		me.multi(a,b);
		break;
		case 4:
		me.div(a,b);
		break;
	}
	

 }

 public void plus(int a, int b){
	int c=a+b;
	System.out.println(a+"+"+b+"="+c);
 }

 public void minus(int a, int b){
	int c=a-b;
	System.out.println(a+"-"+b+"="+c);
 }

 public void multi(int a, int b){
	int c=a*b;
	System.out.println(a+"x"+b+"="+c);
 }

 public void div(int a, int b){
	if(a%b==0){
		int c=a/b;
		System.out.println(a+"÷"+b+"="+c);
	}else{
		double c=a*1.0/b;
		System.out.println(a+"÷"+b+"="+c);
	}
 }

}











