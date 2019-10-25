class Ex03{

  public static void main(String[] args){

    for(int i=0; i<5; i++){
	
       //if(i>2){return;}
       //if(i>2){break;}
       if(i>2){continue;}
       System.out.println(i+1+"번째 반복");
    }
    //System.out.println("main end");
  }

}