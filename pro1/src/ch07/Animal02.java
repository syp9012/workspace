package ch07;

// 다형성
// 동물	- 나이, 먹는다(), 소리내다()
// 고양이는 동물이다. 동물(소리내다()재정의 + +type 속성 + 쥐를 잡다.
// 개는 동물이다.	동물(소리내다()재정의 + +weight 속성 +집지키다()

public class Animal02 {
	// 필드 [access-modifier] [modifier] type [= initial value];
	private int age = 0;
	
	// 생성자 [public] class name ([parameter]){}
	public Animal02() {
		System.out.println("Animal02() 기본생성자야~");
	}
	
	
	// 메서드 [access-modifier] [modifier] returnType ([parameter]){}
	void eat() {
		System.out.println("Animal02-eat()");
		
	}
	
	void sound() {
		System.out.println("Animal02-sound()");
	}
	
	void move() {
		System.out.println("Animal02-move()");
	}
	
	
}
