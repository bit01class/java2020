/*
Q1.
 * * * *
 * * * *
 * * * *
 * * * *

Q2.
1 2 3
4 5 6
7 8 9

Q3.
1 2 3 -> 1 2 3	+0 
2 3 4 -> 1 2 3	+1 
3 4 5 -> 1 2 3  +2
*/
class Ex08{

 public static void main(String[] args){
	int star=123;
	for(int i=0; i<3; i++){
	  System.out.println(star+111*i);
	}
	System.out.println("------------");
	int su=1;
	for(int x=0; x<3; x++){
		for(int y=0; y<3; y++){
		System.out.print(1+y+x);
		}
		System.out.println();
	}
	System.out.println("------------");
	//star="¡Ú¡Ú¡Ú¡Ún¡Ú¡Ú¡Ú¡Ún¡Ú¡Ú¡Ú¡Ún¡Ú¡Ú¡Ú¡Ú";
	//star="123n234n345";
	//    1234567890123456789
	su=1;
	// 5ÀÇ ¹è¼ö - a%5==0
	for(int a=1; a<13; a++){
		if(a%4==0){
		System.out.println();
		}else{
		System.out.print(a%4+a/4);
		}
	}
	
 }

}














