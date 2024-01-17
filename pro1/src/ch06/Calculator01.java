package ch06;

import java.time.LocalDate;

// 이 클래스는 계산기 속성, 기능
public class Calculator01 {
	
	// field [access-modifier][modifier] (type) (field name) [=value];
	private String manufacturer = "카시오";
	private LocalDate dateManufacture = null; // 제조일자 
	private String color ="black";      // 색상
	private String type = "일반용";   // 타입 (일반용, 공학용, 프로그래머)

	
	// constructor [public] class name () {} 
	// method overriding(p317) - 중요!
	// 상위 클래스에서 상속받은 메서드를 재정의. > 오버로딩과의 차이 주의할것.
	// 	1.메소드의 시그니처(리턴타입, 메소드명, 매개변수)는 동일해야 method overriding 이 가능. 
	//  2.접근제한자. 부모클래스와 같거나 더 넓은 범위여야함.
	//  3.예외처리 
	
	
	// Object 클래스의 toString()을 재정의.
	 @Override // annotation 안넣어도 되지만 넣는게 좋다. 
	 public String toString() { 
		  return "manufacturer="+manufacturer+
				  ", dateManufacture="+dateManufacture+ 
				  ", color= "+color + 
				  ", type="+type; 
	}
	 
	
	
	// method [access-modifier][modifier] (return type) (method name)([매개변수 parameter]){[return 표현식]}
	// 객체정보제공=>해당 객체의 field 값을 문자열 형태로 제공.
	// 리턴값은 있고, 매개변수는 없는 메소드
	String getInfo() {
		return "manufacturer="+manufacturer+
				", dateManufacture="+dateManufacture+ 
				", color= "+color +
				", type="+type;
	}
	
	// 리턴값과 매개변수가 있는 메서드
	//
	int plus (int a, int b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		return a + b; 
		// plus() 메서드를 호출한 곳에 리턴값을 반환한다. 
	}

	int minus (int a, int b) {
		return a - b;
	}

	long multiple (int a, int b) {
		return a * b;
	}
	// 메소드 오버로딩시 선언 순서가 중요. 
	// 
	// 나누기
	//divide(10,2) 호출하면
	//int a = 10, int b = 2
	double divide (int a, int b) {
		// (double)a -> 실수형 a
		// (double)b -> 실수형 b 실수타입간의 / 연산
		// /연산의 결과가 double 타입의 변수 result에 대입
		return (double)a / (double)b; // double 타입의 값을 메서드를 호출한 위체에 반환한다.
	}
	// method overloading(메서드 오버로딩) - p263
	// 동일 클래스 내 동일한 이름의 메소드는 존재할수 없다.
	// 단, 매개변수의 개수, 타입, 순서가 다르면 된다. 
	double divide(int a, double b) {
		return a/b;
	}
	
	

}
