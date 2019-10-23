class Ex05{

  public static void main(String[] args){

	int a=-11;
	if(a>=0){
	  System.out.print("양수이고 ");
	}
	if(a<0){
	  System.out.print("음수이고 ");
	}

	if(a%2==0){
	  System.out.println("짝수입니다");
	}
	if(a%2!=0){
	  System.out.println("홀수입니다");
	}
	System.out.println("------------------");
	if(a>=0&&a%2==0){
	System.out.println("양수이고 짝수입니다");
	}
	if(a>=0&&a%2==1){
	System.out.println("양수이고 홀수입니다");
	}
	if(a<0&&a%2==0){
	System.out.println("음수이고 짝수입니다");
	}
	if(a<0&&a%2!=0){
	System.out.println("음수이고 홀수입니다");
	}
	System.out.println("------------------");
	if(a>=0){
	  if(a%2==0){
	    System.out.println("양수이고 짝수입니다");
	  }else{
	    System.out.println("양수이고 홀수입니다");
	  }
	}else{
	  if(a%2==0){
	    System.out.println("음수이고 짝수입니다");
	  }else{
	    System.out.println("음수이고 홀수입니다");
	  }
	}
	System.out.println("------------------");
	if(a>=0&&a%2==0){
	System.out.println("양수이고 짝수입니다");
	}else if(a>=0&&a%2!=0){
	System.out.println("양수이고 홀수입니다");
	}else if(a%2==0){
	System.out.println("음수이고 짝수입니다");
	}else{
	System.out.println("음수이고 홀수입니다");
	}

  }

}














