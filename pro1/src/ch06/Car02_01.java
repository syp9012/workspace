package ch06;

// method declare(p248)
// [access-modifier][modifier] return type method name(){}
// 정보출력



//[public] class 클래스명{}
public class Car02_01 {
	// field attribute 
	// [access-modifier][modifier] field type field name = initial value;
	private String company; // null
	private int price; // 0
	private double fuelEfficiency; // 0.0
	private char grade;  // ""
	private boolean isNewCar;  // 신차 true 신차x false  false
	
	
	
	// constructor class initialization 
	// public class name(){}
	// 정보제공 출력
	// 이름은 사용자 중심으로 만들어야한다.
	void getInfo(){
		System.out.println("company:"+company + 
							",\tprice:"+price + 
							",\tfuelEfficiency:"+ fuelEfficiency +
							",\tgrade:"+grade + 
							",\tisNewCar:"+isNewCar);
	}
	
	
	//회사 정보 출력
	void showCompany() {
		System.out.println("company:"+company);
	}
	
	//가격 정보 출력
	void showPrice() {
		System.out.println("price:"+price);
	}
	
	//연비 정보 출력
	void showFuelEfficiency() {
		System.out.println("fuelEfficiency:"+fuelEfficiency);
	}
	
	//등급 정보 출력
	void showGrade() {
		System.out.println("grade:"+grade);
	}
	
	//신차 여부 정보 출력
	void isNewCar() {
		System.out.println("isNewCar:"+isNewCar);
	}

}

//메서드 선언 및 사용
/* accesss-modifier(접근제한자) private - p293
	-클래스, 필드, 메서드 앞에 명시하여 접근제한.
	private < default(==package) < protected < public 
	private - 동일 클래스 내부에서만 접근허용. 클래스를 구성하는 필드에 주로 사용
*	
*
*
*
*/