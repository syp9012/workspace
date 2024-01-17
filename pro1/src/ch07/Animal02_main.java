package ch07;

// 다형성(polymorphism) - 부모클래스 타입의 참조변수에 (여러)자식객체가 대입될 수 있다.

public class Animal02_main {
	public static void main(String[] args) {
		//    클래스명 참조변수 = new   클래스명();
		// 부모클래스명 참조변수 = new 자식클래스명();
		// 부모클래스명 참조변수 = new 자식클래스명();
		Animal02 animal = new Animal02();
		// promotion
		Animal02 animal2 = new Cat();
		animal2.eat(); //부모클래스의 eat()호출 Animal02-eat()
		animal2.sound(); // Cat에서 오버라이딩한 sound()호출 => Cat sound() 야옹
		// animal2.catchMouse // 부모클래스에는 catchMouse가 선언이 안되어있기 때문.
		

		// 상위클래스->하위클래스 클래스간의 형변환 casting
		Cat myCat = (Cat)animal2; // 부모클래스인 Animal02타입에서 자식클래스인 Cat타입으로 강제 형변환.
		myCat.catchMouse(); 	
		
		//자동형변환 작 -> 큰
		//강제형변환 큰 -> 작  (강제형변환)변수명 (int) 변수명
		
		
		System.out.println("-----------------------------");
		
		
		Animal02 animal3 = new Dog();
		animal3.eat(); //Animal02-eat()
		animal3.sound(); // 멍멍~ 
		
		Dog dog = (Dog)animal3;  // 부모 Animal02클래스타입에서 자식Dog 클래스로 강제 형변환.
		dog.guard(); // "Dog-guard()
		
		
		
		System.out.println("===============================");
		// 변수의 자동형변환
		Animal02 myAnimal = new Animal02();
		myAnimal = new Dog(); // 자동형변환
		myAnimal = new Cat(); // up class casting
		
		Dog dog3 = (Dog) myAnimal;
		
		
		
		
		
		

		
	}

}
