package ch07;

public class Dog extends Animal02{
	int weight = 10;
	
	
	public Dog() {
		System.out.println("Dog-기본생성자()");
	}
	
	
	void guard() {
		System.out.println("Dog-guard()");
	}
	
	@Override
	void sound() {
		System.out.println("멍멍~");
	}

	@Override
	void move() {
		System.out.println("Dog-move():뛴다.");
	}
	
}
