package ch07;

// instanceof 연산자(p350, 이것이 자바다 7장 14번째 슬라이드)
// 매개변수가 아니더라도 변수가 참조하는 객체의 타입을 확인할때 instanceof 연산자를 사용
// instanceof 연산자에서 좌항의 객체가 우합의 타입이면 true를 산출하고 그렇지 않으면 false를 산출
// 객체참조변수 instanceof 타입 
// 매개변수의 다형성(polymorphism, p345) - 하나의 부모클래스타입 참조변수에 
// 강제타입변환(p348)

public class Person{
	//필드
	String s;
	

	//메서드
	//메서드 오버로딩 - 동일클래스내 메서드명은 동일x
	//단, 매개변수의 개수,타입,순서가 다르면 가능.

	//person.walk(new Cat()); // Animal02 obj = new Cat();
	//person.walk(new Dog()); // Animal02 obj = new Dog();
	void walk(String s) {
		s.length(); // String 클래스의 length() 는 글자수 조회하는 기능.
		System.out.println(s+"와 함께 walk()");
		System.out.println("글자수 =" +s.length());	
	}
	
	public void walk(Object obj) {
		System.out.println(obj+"와 함께 walk()");
		
		if(obj instanceof Dog) {
			System.out.println("true! Dog 객체야");
			((Dog)obj).move();  
		}else if(obj instanceof Cat) {
			System.out.println("true! Cat 객체야");
			((Cat)obj).move();  
		}else if(obj instanceof Animal02) {
			System.out.println("Animal02 객체야");
			((Animal02)obj).move(); // Object 클래스에 move 메소드가 존재하지 않는다. 
		}else {
			System.out.println("false! 아닌데!");
			
		}
		
// 다형성을 이용해서 특정 클래스 진행. 
//	public void walk(Animal02 obj) {
//		System.out.println(obj+"와 함께 walk()");
//		obj.move();
//	}
//	void walk(Cat obj) {
//		System.out.println(obj+"와 함께 walk()");
//		obj.move();
//	}
//	void walk(Dog obj) {
//		System.out.println(obj+"와 함께 walk()");
//		obj.move();
//	}
		//Animal02 로 다운캐스팅. > 바람직한 코드는 아님.
		// (Animal02)obj : 참조변수 obj를 Animal02클래스로 down casting 해라.
		//Animal02 타입으로 형변환된 obj의 move()호출
	}
	
}
