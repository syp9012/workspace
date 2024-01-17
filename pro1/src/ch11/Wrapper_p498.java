package ch11;

/*Wrapper(포장클래스)_p498
 * 포장 객체
	기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체
	포장하고 있는 기본 타입의 값을 변경할 수 없고, 단지 객체로 생성하는 목적

* 박싱과 언박싱
	박싱: 기본 타입 값을 포장 객체로 만드는 과정. 포장 클래스 변수에 기본 타입 값이 대입 시 발생
	언박싱: 포장 객체에서 기본 타입 값을 얻어내는 과정. 기본 타입 변수에 포장 객체가 대입 시 발생

* 문자열을 기본 타입 값으로 변환(p502)
	포장 클래스는 문자열을 기본 타입 값으로 변환할 때도 사용. 
	대부분의 포장 클래스에는 ‘parse+기본타입’ 명으로 되어 있는 정적 메소드 있음 
  		예)Integer.parseInt("5000") => int타입 5000을 반환

*/

public class Wrapper_p498 {
	
	public static void main(String[] args) {
		//value 100을 기본타입 int 변수에 저장;
		int a = 100;
		System.out.println(a); //100
		
		//자동박싱 auto-boxing
		//value100을 Integer 객체로 생성하여 참조변수에 대입;
		Integer obj = new Integer(100);
		System.out.println(obj); //100 Object의 toStirng을 오버라이딩해서 값을 출력.
		System.out.println(obj.MIN_VALUE); // -2147483648
		System.out.println(obj.MAX_VALUE);//2147483647
		
		obj = new Integer("500");  
		System.out.println(obj); //500
		
		//자동언박싱 auto-unboxing
		int i = obj;
		int i1 = new Integer("50000"); 
		int i2 = new Integer("50000")+123;
		//+연산을 하기전에 자동으로 언박싱 진행
		System.out.println(i1); // 50000
		System.out.println(i2); //50123
		
	}
	
	
	
	
}
