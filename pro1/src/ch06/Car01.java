package ch06;

// 패키지(p287)
// util 패키지에 있는 전부를 import util 바로 밑에 있는 패키지만 import 손자 클래스는 import 하지 않는다. 
import java.util.*;

// java.lang 패키지에 속한 클래스 인터페이스 등)는 반드시 import 해야됨.

/* 문법
[public] class 클래스명{
	
	// field - 속성
	// [access-modifier][modifier]타입 변수명;  초기값을 넣어줄수도 있다.

	//constructor (p232)  생성자가 public 이면 클래스도 public 이어야한다. 
	//[public] 클래스명() {}
	 
	//method - 기능, 동작
	//[access-modifier][modifier]리턴타입 메소드명 () {
	//}
*/
public class Car01 {

	// field - 속성
	// [access-modifier][modifier]타입 변수명;  초기값을 넣어줄수도 있다.
	String company = "현대";
	String model = "소나타";
	String color = "yellow";
	int price  = 800;
	double  fuelEfficiency= 8.5;  // 결합에 _를 적는것은 snake 방식, 대문자로 적는것은 camel 방식
	Date productionDate = null; // Date라는 단어는 db에서 문제가 될 여지가 있음.
	String[] fuel = {"경유", "휘발유", "전기", "하이브리드"};

	
//	 method - 기능, 동작
//	 [access-modifier][modifier]리턴타입 메소드명 () {
//	 }
	// 출발하다.
	void start(){
		System.out.println("start()호출성공!");
	}
	
	
	// 멈추다.
	void stop(){
		System.out.println("stop()실패!");
	}  
	
	// 속도높이다.
	void speedUp(){
		System.out.println("speed up");
		} 

	// 속도 늦추다.
	void speedDown(){
		System.out.println("speed down");
	}
	
	// 방향조절하다.
	void controlDirection(){
		System.out.println("direction control");
	}  


}
