package ch06;

/*[접근제한자] [지시어] 리턴타입 메소드명 () {}

1) 매개변수 , 리턴값 없음.
void 메서드명(){
}

2) 매개변수 없음. 리턴값 있음.
리턴타입 메서드명(){
return 값;
}

3) 매개변수 있음. 리턴값 없음. > 메인 메소드 도 해당 적용.
void 메서드명(타입 변수){
}

4) 매개변수, 리턴값 있음.
리턴타입 메서드명(타입 변수){
return 값;
}
*/

public class Car02_01_main {

	public static void main(String[] args) {
		
		Car02_01 myCar = new Car02_01();
				
		// 필드값을 private 접근제한자로 접근을 막을시, 메서드를 통해 우회접근 가능.
		//메서드 사용-메서드 호출
		myCar.showCompany();
		myCar.showPrice();
		myCar.showFuelEfficiency();
		myCar.showGrade();
		myCar.isNewCar();
		
		System.out.println("----------------");
		
		myCar.getInfo();
	}
	
}
