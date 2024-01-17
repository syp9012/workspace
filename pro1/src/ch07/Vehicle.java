package ch07;

//인터페이스(p370)
// [public] interface 인터페이스명{}
// 인터페이스로 만들경우 약속되어져 있는데로 준수하면서 코드를 구현해야한다.
public interface Vehicle {
	//[public static final] 타입 상수명 = 초기값;
	//[접근제한자] [지시어] 타입 필드명[=초기값];
	public static final int MAX_SPEED = 300;
	public static final int MIN_SPEED = 10;
	
	//생성자가 존재하지 않는다. 	비교 > 추상클래스에는 생성자는 존재한다.
	//구현클래스를 통해 객체를 생성		비교> 하위클래스를 통해서 객체가 생성된다.
	//public Vehicle() {}
	//Interfaces cannot have constructors
	
	//[public abstract] 리턴타입 메서드(){}  추상메서드
	//[접근제한자] abstract 리턴타입 메서드(){}
	//[접근제한자] [지시어] 리턴타입 메서드(){}
	
	public abstract void run();
	
	
}
 