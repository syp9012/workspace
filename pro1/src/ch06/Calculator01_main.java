package ch06;

import java.util.Scanner;

//이 클래스는 Calculator01클래스의 실행클래스이다.
public class Calculator01_main {
	// field
	// constructor


	
	public static void main(String[] args) {
		// static이 붙은 메소드에서는 static이 붙은 필드에만 접근가능하다.
		// 클래스명 변수명 = new 클래스명();
		
		Calculator01 calc = new Calculator01();
		System.out.println("-참조 변수 사용----------");
		
		System.out.println("calc 주소는 " + calc);
		
		System.out.println("-toString overriding 사용--------");
		System.out.println(calc.toString());
		/* Carculator01클래스에서 toString() 메서드를 호출.
		 * Object 클래스의 toString()를 호출
		 * Carculator01 클래스에서 toString() 메서드를 재정의.
		 * Carculator01 클래스(객체)의 toString() 매서드를 호출
		 */
		//Returns a string representation of the object. 
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//패키지.클래스명 @ 16진수 해시코드
		
		// 조상클래스 = 부모클래스 = 상위 클래스 = super class(전체) 
		// 자손클래스 = 자식클래스 = 하위 클래스 = sub class
		
		//객체의 정보를 문자열타입으로 반환합니다.
		
		
		System.out.println("-getInfo 사용--------");
		System.out.println(calc.getInfo());
		//manufacturer = "casio"; 은닉성 private 접근제한자로 막혀있음. 
		
		int result = calc.plus(10, 90);
		System.out.println("plus result = " + result);
		
		result = calc.minus(90, 10); // 80
		System.out.println("minus result = " + result);
		
		// 메소드를 호출할때는 매개변수의 타입, 개수, 순서를 맞춰야 한다.
		// 리턴값이 있는 경우에는 리턴타입에 주의하여 사용해야 한다.
		// 아래에서는 메서드 호출시 2개의 정수를 제시하였으며, 
		// 리턴타입이 long이므로 long 타입의 변수 result2를 준비.
		long result1 = calc.multiple(10, 90); // 900
		System.out.println("multiple result = " + result1);
		
		double result2 = calc.divide(90, 10); // 9.0
		System.out.println("divide result = " + result2);
		
		// 계산기 클래스에 divide가 여러개존재해도
		// 매개변수의 개수,타입,순서에 맞추어 호출된다.
		result2 = calc.divide(90, 11.0); //
		System.out.println("divide result = " + result2);
		
		
		 System.out.println();
	}

}
