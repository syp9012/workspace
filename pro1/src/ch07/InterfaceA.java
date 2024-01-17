package ch07;

public interface InterfaceA {
	//상수
	
	
	//(추상)메서드 - [public abstract] 리턴유형 메서드명()	
	public abstract void a();
	
	// default 메서드 선언
		// default 리턴유형 메서드명(){}
		default void defaultMethod() {
			System.out.println("interface에서 선언한 default 메서드~~");
		}
}
