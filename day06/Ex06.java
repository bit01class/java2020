class Ex06{

 public static void main(String[] args){
	java.util.Scanner sc;
	sc=new java.util.Scanner(System.in);
	int su1,su2,su3;
	System.out.print("첫번째:");
	su1=sc.nextInt();
	System.out.print("두번째:");
	su2=sc.nextInt();
	System.out.print("1.+ 2.- 3.× 4.÷ :");
	su3=sc.nextInt();

	if(su3==1){
		myPrint1(a,'+',b,plus(a,b));
	}else if(su3==2){
		myPrint1(a,'-',b,minus(a,b));
	}else if(su3==3){
		myPrint1(a,'x',b,multi(a,b));
	}else if(su3==4){
		if(a%b==0){
		myPrint1(a,'÷',b,div1(a,b));
		}else{
		myPrint2(a,'÷',b,div2(a,b));
		}
	}
 }
 public static void myPrint1(int a, char ch, int b, int c){
	System.out.println(a+""+ch+b+"="+c);
 }
 public static void myPrint2(int a, char ch, int b, double c){
	System.out.println(a+""+ch+b+"="+c);
 }

 public static int plus(int a,int b){
	return a+b;
 }

 public static int minus(int a,int b){
	return a-b;
 }

 public static int multi(int a,int b){
	return a*b;
 }

 public static int div1(int a, int b){
	return a/b;
 }

 public static double div2(int a, int b){
	return a*1.0/b;
 }

}








