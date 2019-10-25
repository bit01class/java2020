/*
Q1. A~Z까지 출력하시오

Q2. A(a) B(b)... Z(z)출력하시오

Q3. 다음을 출력하시오
★
★ ★
★ ★ ★
★ ★ ★ ★
		
1		1+2
2 3		3+3
4 5 6		6+4
7 8 9 0		10+5
		15+6
		21

1
1 2
1 2 3
1 2 3 4

1
2 1
3 2 1
4 3 2 1

A
B C
D E F
G H I J

*/
class Ex09{

  public static void main(String[] args){

    System.out.println("Q1. A~Z까지 출력하시오");
    // A 65
    // Z 
    int total='Z'-'A'+1;
    int gap='a'-'A';
    for(int i=0; i<total; i++){
	System.out.print((char)('A'+i)+"("+(char)('A'+i+gap)+")");
    }
    System.out.println("\n---------------------------------");
    int cnt1=0;
    while(true){
	System.out.print((char)('a'+cnt1));
	if((char)('a'+cnt1)=='z'){break;}
	cnt1++;
    }
    System.out.println("\nQ3. 별출력");
    
    //int cnt=1;
    for(int j=1; j<5; j++){
	for(int i=0; i<j; i++){
		System.out.print(i+1);
	}
	System.out.println();
    }
    System.out.println("\n---------------------------------");
	int temp=1;
    	int enter=1;
	for(int i=1; i<11; i++){
		System.out.print(i);
		if(i==temp){
			enter++;
			temp+=enter;
			System.out.println();
		}
	}
    System.out.println("\n---------------------------------");
	//1	=("")+1
	//12	=(""+1)+2
	//123	=(""+1+2)+3
	//1234	=(""+1+2+3)+4
	String temp2="";
	for(int i=1; i<5; i++){
		temp2=i+temp2;
		System.out.println(temp2);
	}
    System.out.println("\nQ4. 4321출력");
	for(int j=1; j<5; j++){
		for(int i=j; i>0; i--){
			System.out.print(i);
		}
		System.out.println();
	}
  }

}




















