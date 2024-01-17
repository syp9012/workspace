package ch07;

public interface InterfaceC extends InterfaceA, InterfaceB {
	//interfaceA, interfaceB 의 상수, 메서드 상속
	
	//(추상)메서드 - [public abstract] 리턴유형 메서드명()	
		public abstract void c();
		
	// default 메서드 선언
	// default 리턴유형 메서드명(){}
//		default void defaultMethod() {
//			System.out.println("interface에서 선언한 default 메서드");
//		}
//		
	
}
