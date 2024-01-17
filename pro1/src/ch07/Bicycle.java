package ch07;

//자식클래스는 오직 1개의 부모크래스만을 상속받을수 있다. 
//class 클래스명 extends 부모클래스명{}

// 이클래스는 interface Vehicle의 구현클래스이다.
// 구현클래스는 n개의 인터페이스를 구현할수 있다.
// 단, 모든 인터페이스에서 선언한 abstract 메서드를 반드시 overriding 해야한다. 
// class 클래스명
public class Bicycle implements Vehicle{
	// 필드
	
	
	// 생성자
	public Bicycle () {
		System.out.println("Bicycle의 기본생성자야");
	}
	
	
	//메서드 - 구현클래스ㅡㄴ 인터페이스의 추상메서드를 오버라이딩해야만 한다.
	@Override
	public void run() {
		System.out.println("Bicycle-run():발로 페달밟아요");
	}

	
}
