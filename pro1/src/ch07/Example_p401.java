package ch07;


//p401
//단일 클래스 상속
//class 클래스명 extends 상위클래스

//다중 인터페이스 구현 => (구현클래스에서) 인터페이스의 추상메서드를 반드시 오버라이딩 해야 한다. 
//class 클래스명 implements 상위인터페이스1,...인터페이스명n
//class ClassImpl implements

// 다중인터페이스 구현 클래스 + 상위클래스 상속 => 반드시 인터페이스의 추상메서드를 반드시 오버라이딩 해야 한다.
// class 클래스명 extends 상위클래스 implements 인터페이스명1, 인터페이스명3,.....인터페이스명 n

//인터페이스 상속 => 구현클래스에서 상위 인터페이스의 추상메서드를 반드시 오버라이딩 해야 한다. 
//interface 인터페이스명 extends 상위인터페이스1,...인터페이스명n
//interface interfaceA
//interface interfaceB
//interface interfaceC extends interfaceA, interfaceB


//    클래스명 참조변수 = new   클래스명();
// 상위클래스명 참조변수 = new 하위클래스명(); // 다형성
// 인터페이스명 참조변수 = new 구현클래스명(); // 다형성

public class Example_p401 {

	public static void main(String[] args) {
		//구현클래스의 객체를 생성
		//다형성
		ClassImpl  cImpl = new ClassImpl();
		InterfaceA ia = cImpl;
		ia.a();
		ia.defaultMethod();
		InterfaceB ib = cImpl;
		ib.b();
		System.out.println("------------------");
		InterfaceC ic = cImpl;
		ic.a();
		ic.b();
		ic.c();
		ic.defaultMethod(); // 구현하지 않아도 된다.
	}
}
