package ch07;

public class Vehicle_main {
	public static void main(String[] args) {
		// 인터페이스 Vehicle의 run 메소드 호출
		// 구현클래스명.run();
		//   클래스명 참조변수 = new   클래스명();
		//상위클래스명 참조변수 = new 하위클래스명(); 다형성 polymorphism
		//인터페이스명 참조변수 = new 구현클래스명(); // 다형성
		//List     list   = new AarryList();  
		//Set       set   = new HashSet(); 
		//Map       map   = new HashMap();
				
		//AarryList     list   = new AarryList();  
		//HashSet       set    = new HashSet(); 
		//HashMap       map    = new HashMap();

		// 다형성을 위해서 상위클래스를 사용하여 변수를 생성하여 사용하는 것이 좋다.
		
		Vehicle vc = new Bicycle(); //
		vc.run();
		vc = new Bus(); //
		vc.run();
	}

}
