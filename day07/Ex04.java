

class Ex04{

 public static void main(String[] args){
	Car myCar=new Car();
	myCar.model="모닝";
	myCar.name="붕붕이";
	myCar.accel=5;
	System.out.println("이름이 "+myCar.name+"인 내차 "+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedUp();
	System.out.println("이름이 "+myCar.name+"인 내차 "+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedDown();
	System.out.println("이름이 "+myCar.name+"인 내차 "+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar=new Car();
	myCar.model="아반떼";
	myCar.name="종이장";
	myCar.accel=25;
	System.out.println("이름이 "+myCar.name+"인 내차 "+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedUp();
	System.out.println("이름이 "+myCar.name+"인 내차 "+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedDown();
	System.out.println("이름이 "+myCar.name+"인 내차 "+myCar.model+"이 "+myCar.speed+"km로 달린다");
	
 }

}

class Car{
	//변수-속성
	int no;
	String model;
	int speed=0;
	String name="이름없음";
	int accel;
	
	//메서드-행위
	public void speedUp(){
		speed+=accel;
	}
	public void speedUp(int a){
		speed+=a;
	}

	public void speedDown(){
		speed-=accel;
	}
	public void speedDown(int b){
		speed-=b;
	}
}



