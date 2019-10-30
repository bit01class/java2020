class Ex03{
 static int su1=1234;
 int su2=4321;

 public static void main(String[] args){
	Ex03 me = new Ex03();
	System.out.println("su1="+su1);
	System.out.println("su2="+me.su2);
	me = new Ex03();
	me.func2();
	System.out.println("su1="+su1);
	System.out.println("su2="+me.su2);
	me = new Ex03();
	me.func2();
	System.out.println("su1="+su1);
	System.out.println("su2="+me.su2);
	
 }

 public static void func1(){
	su1++;
	Ex03 me = new Ex03();
	System.out.println("func1 me:"+me);
	me.su2++;
 }

 public void func2(){
	su1++;
	su2++;
 }
}






