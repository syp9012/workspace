package ch07;

import ch06.Car01;

// Animal02의 main 클래스2
// 배개 변수의 다형성(polymorphism)
public class Animal02_main2 {
	
	
	
	public static void main(String[] args) {
		
		
		Person p = new Person();
		//p.walk("가족"); // 사람이성친구:Person-walk()
		
		//p.walk(new Car01()); // Class 간의 형변환의 에러가 나면 ClassCastException이 나온다.
		//runtime exception 발생
		//파라미터의 값으로 제시한 Car01 클래스는 Animal02 클래스와 상속관계가 아니기 때문에 관계가 없다. 
		// 상속관계로 묶여져있는 관계끼리는 형변환이 가능하지만, 그렇지 않은경우 ClassCastException 이 발생할수 있다.
		//p.walk(new Cat());
		p.walk(new Dog()); 
		//p.walk(new Animal02());  // Animal02() 기본생성자야~ 
		
		
		System.out.println("-----------------------");
		/*
		 * // Animal02 클래스타입의 참조변수 animal에 Animal02() 객체를 선언 Animal02 animal = new
		 * Animal02(); //Animal02() 기본생성자야~ animal.move(); // Animal02-move()
		 * System.out.println("-----------------------");
		 * 
		 * animal = new Dog(); // Animal02() 기본생성자야~ , Dog-기본생성자( animal.move(); //
		 * Animal02-move() // Dog의 move 재정의 전.
		 * System.out.println("-----------------------");
		 * 
		 * animal = new Cat(); //기본생성자야~ , Cat-기본생성자() animal.move(); // Animal02-move()
		 * // Cat의 move 재정의 Cat-move():움직여
		 * 
		 */
		
	}
}
