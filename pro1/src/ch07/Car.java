package ch07;

//
//이 클래스는 Tire 클래스를 필드사용 =>has a 관계
//필드 타이어 클래스에 자식클래스의 객체를 대입 => 필드의 다형성
//static이 붙으면 클래스필드

public class Car {
	//필드
	Tire fLTire = new Tire("앞왼쪽", 6); // 인스턴스 필드
	Tire fRTire = new Tire("앞오른쪽", 2); //
	Tire bLTire = new Tire("뒤왼쪽", 3); //
	Tire bRTire = new Tire("뒤오른쪽", 4); // 
	
	//생성자 기본생성자

	//메서드
	
	//움직이다 - 리턴값 : 타이어펑크 발생한 위치
	//fLTire.roll()==false ,!fLTire.roll()
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(fLTire.roll()==false) {
			stop();
			return 1;
		}
		if(fRTire.roll()==false) {
			stop();
			return 2;
		}
		if(bLTire.roll()==false) {
			stop();
			return 3;
		}
		if(bRTire.roll()==false) {
			stop();
			return 4;
		}
		return 0; //잘굴러가는 상태
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	
}
