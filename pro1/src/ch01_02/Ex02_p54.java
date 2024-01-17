package ch01_02;

// 변수의 가용범위 scope
public class Ex02_p54 { // class block
	static int a; // global variable. field. static variable
	// 데이터타입 앞에 접근제한자 등이 들어갈수 있음.
	
	static int base;
	static char aase;
	
	public static void main(String[] args) { // method block
		// 데이터타입 변수명 = 값 할당;
		int v1 = 10;
		v1 = 20;
		a = 500;
		System.out.println(a);
		
		
		int v2; // variable declare
		v2 = 100; // 변수 사용
		// 지역변수는 사용하기 전에 초기화되어야된다.
		System.out.println(v2); //The local variable v2 may not have been initialized.
		
		System.out.println(base);
		System.out.println(aase);
		
	}
	// v1 = 30; method block 에서 선언한 variable를 class block에서 사용 하다 보니 error 발생. 
	void method1() {
		long v2 = 100;
		v2 = 200;
		a = 600;	
	}
	// v2 = 300; method block 에서 선언한 variable를 class block에서 사용 하다 보니 error 발생.
}