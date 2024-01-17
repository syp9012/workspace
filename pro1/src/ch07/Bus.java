package ch07;

//이클래스는 interface Vehicle의 구현클래스이다.
public	class Bus implements Vehicle {
	// 필드
	
	
	// 생성자
	public Bus () {
		System.out.println("Bus의 기본생성자야");
	}
	
	@Override
	public void run() {
		System.out.println("Bus클래스-run():버스달려");
	}
	
	
}
