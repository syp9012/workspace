package ch07;

public class ClassImpl implements InterfaceC{


	//필드
	
	//생성자
	
	//메서드 [access-modifier] [modifier]
	@Override
	public void a() {
		System.out.println("오버라이딩한 a()");	
	}
	
	@Override
	public void b() {
		System.out.println("오버라이딩한 b()");	
	}
	
	@Override
	public void c() {
		System.out.println("오버라이딩한 c()");	
	}	
	
	
}
