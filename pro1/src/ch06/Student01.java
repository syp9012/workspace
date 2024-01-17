package ch06;


//[public] class 클래스명 extends 부모클래스명{}
//모든 클래스는 Object를 상속받기에 
// [public] class 클래스명 [extends Object{}]

// static 멤버 (필드,메서드) => 정적필드, 정적메서드, 클래스멤버(클래스필드, 클래스메서드)   - 참조변수를 통해 접근해도되지만 클래스를 통해서도 접근이 가능하다.
// 사용문법 > 클래스명.필드명  클래스명.메서드명
// non-static 필드 => 인스턴스(필드,메서드), 인스턴스멤버
// 사용문법 > 참조변수명.필드명  참조변수명.메서드명


public class Student01 {
	
	
	// field [access-modifier][modifier] fieldType fieldName [= initialization];
	static String department = "중앙정보기술인재개발원";
	String name;
	int age;
	
	// constructor public className() {}
	// constructor overloading
	// default constructor(기본생성자)
	public Student01() {
		System.out.println("Student01()생성자호출");
	}
	
	public Student01(String name) {
		this.name = name; // 필드의 초기화
	}

	public Student01(int age) {
		this.age = age; // 필드의 초기화
	}
	
	public Student01(String name, int age) {
		this.name = name; // 필드의 초기화
		this.age = age; // 필드의 초기화
	}
	public Student01(int age, String name) {
		this.name = name; // 필드의 초기화
		this.age = age; // 필드의 초기화
	}
	// 생성자의 접근제한자는 항상 public이 아니다. 
	// ex) 싱글톤의 접근제한자는 private
	// 
	
	// override
	@Override
	public String toString() {
		//super는 부모클래스의 참조변수
		//return super.toString();
		return "name : "+name +", age : "+ age;
	}
	
	// method [access-modifier][modifier] returnType methodName ([argument]) {}
	
	// name 필드의 값을 외부에서 받아 설정 메서드 선언
	// age 필드의 값을 외부에서 받아 설정 메서드 선언
	// this 는 해당하는 객체의 주소
	
	//name 필드의 값을 외부에 제공
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setName(String name) {
		this.name = name;
		//100번지.name 필드 = 홍길동;
		//200번지.name 필드 = 이재용;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	// method overloading
	void eat() {}
	void eat(String bab) {}
	void eat(String bab, String b1) {}
	void eat(String bab, String b1, String b2) {}
	void eat(String ...strings) {}
	void sleep() {}
	void study() {}
	
	
	
}
