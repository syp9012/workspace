package ch07;

public class Fish extends Animal01 {

	String kind;
	
	// 기본생성자 - 매개변수가 없는 생성자
	public Fish() {
		kind = "방어";
	
	}
	
	@Override
	void move() {
		System.out.println("헤엄친다");
	}


	// 필드가 선언된 상태에서
	// Animal 클래스의 toString()를 재정의;
	// 내용은 Fish클래스의 필드값을 사용하는 형태로 작성.
	// this.toString() 작성되면서
	// Fish 클래스의 toString()을 호출
	
	@Override
	void sleep() {
		System.out.println("눈을 뜨고 잔다");
	}
	
	// 부모의 모든 메서드를 반드시 오버라이딩 하는 것은 아니다.
	// 부모의 추상메서드는 반드시 오버라이딩 해야한다. 
	
	@Override
	public String toString() {
		return "Fish [gender=" + gender + ", age=" + age + ", kind=" + kind + "]";
	}
	
	
	//필드가 선언되지 않은 상태에서
	// Animal 클래스의 toString()를 재정의;
	// 내용은 super.toString() 작성되면서
	// 부모인 Animal 클래스의 toString()을 호출
	
	//	@Override
	//	public String toString() {
	//		return "Fish [gender=" + gender + ", age=" + age + ", kind=" + kind + "]";
	//	}
	
	
}
