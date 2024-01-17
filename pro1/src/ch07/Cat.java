package ch07;

public class Cat extends Animal02 {
	// 필드
	String type = "페르시안고양이";
	
	// 생성자
	public Cat() {
		// super(); // 부모클래스Animal02의 기본생성자 호출
		System.out.println("Cat-기본생성자()");
	}
	
	
	// 메서드
	// catch는 예약문이라 사용할수 없다. 
	void catchMouse() {
		System.out.println("Cat-catchMouse():쥐잡자");
	}
	
	
	  @Override 
	  void sound() {
		  System.out.println("야옹"); 
	  }
	  
	  @Override
	  void move() {
		  System.out.println("Cat-move():고양이걸음");
	  }
	 
	 
}
	


