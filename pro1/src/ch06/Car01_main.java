package ch06;

import java.util.Arrays;

/*
	field
	[access-modifier] [modifier] 타입 필드명 = 초기값; 
	
	constructor
	[public] 클래스명() {}; 	
	
	method 
	[access-modifier] [modifier] 리턴타입 메소드명 () {}

*/

public class Car01_main {

	public static void main(String[] args) {
		System.out.println("main진입");
		
		// Car01 클래스에서 자동차 object 를 생성
		// 타입 변수 = new 클래스명 ();
		Car01 myCar = new Car01();  // object 생성
		Car01 myCar2 = new Car01();
		
		// 각 객체마다의 주소확인.
		System.out.println(myCar); //ch06_class.Car01@3b6eb2ec
		System.out.println(myCar2); //ch06_class.Car01@1e643faf
		
		// 속성조회
		System.out.println("myCar2.company="+myCar2.company);  // 현대
		System.out.println("myCar2.model="+myCar2.model);  // 소나타
		System.out.println("myCar2.color="+myCar2.color);  // yellow
		System.out.println("myCar2.price="+myCar2.price); // 800
		System.out.println("myCar2.fuelEfficiency="+myCar2.fuelEfficiency); // 8.5
		System.out.println("myCar2.productionDate="+myCar2.productionDate); // null
		System.out.println("myCar2.fuel="+myCar2.fuel); // 주소값
		System.out.println();
		
		String[] fuel = myCar2.fuel;
		
		
		// 1. 향상된 for 문을 이용한 배열안 내용 확인.
		for(String fue : myCar2.fuel) {
			System.out.printf("%8s",fue);
		}
		
		System.out.println("");
		
		// 2. for 문을 이용한 배열 안 내용 확인,
		for(int i = 0; i < myCar2.fuel.length; i++) {
			System.out.printf("%-8s",myCar2.fuel[i]);
			// %-8s %s는 문자열 -8은 총 8자리인데 왼쪽 정렬
		}
		System.out.println("");
		
		// 3. Arrays toString을 통한 배열 안 내용 확인.
		System.out.printf("%s\n\n",Arrays.toString(myCar2.fuel));
				
		
		// 기능확인.
		myCar.start(); // start()메서드 호출.
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedDown();
		myCar.speedDown();
		myCar.controlDirection();
		myCar.speedDown();
		myCar.controlDirection();
		myCar.speedDown();		
		myCar.stop();  // stop()메서드 호출
		
	}
	
}
