class Ex01{
  //set path=C:\Program Files\Java\jdk1.8.0_231\bin;%path%

  public static void main(String[] args){
	//Q1. 1~100까지의 합을 구하세요
	int sum=0;
	for(int i=1; i<=100; i++){
		sum+=i;
	}
	System.out.println("1~100까지의 합은?"+sum);
	System.out.println("---------------------------");
	//Q2. 다음을 출력하시오
	//	1 3 5 7 9
	for(int i=1; i<=9; i+=2){
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=0; i<10; i++){
		if(i%2!=0){
		System.out.print(i+" ");
		}
	}
	System.out.println();
	for(int i=0; i<5; i++){
	// 1(1+2*0) 3(1+2*1) 5(1+2*2) 7(1+2*3) 9(1+2*4)
		System.out.print(1+2*i+" "); 
	}
	System.out.println(); 
	System.out.println("------------------");
	//Q3. 다음을 출력하시오
	//2의1승 2의2승 2의3승 2의4승 2의5승
	//2	2*2	2*2*2	2*2*2*2	2*2*2*2*2
	//1*2	1*2*2	1*2*2*2	1*2*2*2*2	1*2*2*2*2*2

	int su=1;
	for(int i=0; i<1; i++){
		su=su*2;
	}	
	System.out.print(su+" ");

	su=1;
	for(int i=0; i<2; i++){
		su=su*2;
	}
	System.out.print(su+" ");

	su=1;
	for(int i=0; i<3; i++){
		su=su*2;
	}
	System.out.print(su+" ");

	su=1;
	for(int i=0; i<4; i++){
		su=su*2;
	}
	System.out.print(su+" ");

	
	su=1;
	for(int i=0; i<5; i++){
		su=su*2;
	}
	System.out.print(su+" ");

	System.out.println();
	System.out.println("-------------------------");
	for(int j=1; j<=5; j++){
		int temp=1;
		for(int i=0; i<j; i++){
			temp=temp*2;
		}	
		System.out.print(temp+" ");
	}
	System.out.println();
	System.out.println("-------------------------");
	int a=1;
	for(int i=0; i<5; i++){
		a+=a;
		System.out.print(a+" ");
	}
	System.out.println("\n-----------------------------");
	//Q4. 2+4+6+8+10=30
	int sum2=0;
	for(int i=2; i<=10; i+=2){
		sum2+=i;
		System.out.print(i);
		if(i!=10){System.out.print("+");}
	}
	System.out.println("="+sum2);
	System.out.println("\n-----------------------------");
	int sum3=0;
	int limit=100;
	int start=90;
	boolean boo=false;
	for(int i=start; i<=limit;i++){
		if(i%2==0){
			if(boo){
			System.out.print("+");
			}else{
			boo=true;
			}
			sum3+=i;
			System.out.print(i);
		}
	}
	System.out.println("="+sum3);

  }



}









