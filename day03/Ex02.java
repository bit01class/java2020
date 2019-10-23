class Ex02{

 public static void main(String[] args){
	// 증감연산자
   int a;
   a=100;

   System.out.println("a="+a);
   a=a+1;
   System.out.println("a="+a);
   a=a+1;
   System.out.println("a="+a);
   a++;
   System.out.println("a="+a);
   ++a;
   System.out.println("a="+a);
   a=++a;
   System.out.println("a="+a);
   a=a++;
   System.out.println("a="+a);
   a+=1;
   System.out.println("a="+a);


   System.out.println("---------------------");
   
   System.out.println(3>2);
   System.out.println(3<2);
   System.out.println(3>=2);
   System.out.println(3<=2);
   System.out.println(3+2-(100*2)>(2*2)-(9%2));
   int b=2;
   System.out.println(b==3-1);
   System.out.println(b!=3-1);

   System.out.println("--------------------------------");
   System.out.println(true&&true);
   System.out.println(true&&false);
   System.out.println(false&&false);

   System.out.println(true||true);
   System.out.println(true||false);
   System.out.println(false||false);
   System.out.println("------------------------");
   System.out.println(!true);
   System.out.println(!false);
 }

}









