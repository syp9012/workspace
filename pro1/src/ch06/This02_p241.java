package ch06;


// this()(p241) : 생성자 또다른 생성자 호출.
// 주의. this()는 반드시 생성자 내부의 첫번째줄에서 호출.
// this(p237) : 객체 자신의 참조(변수)

public class This02_p241 {
	// 필드
	String name;
	int age;
	char type;
	double height;
	boolean isBoolean;
	
	
	
	
	// 생성자 - 필드 초기화 
	// default constructor(기본생성자) - 매개변수가 없는 생성자

		
	public This02_p241() {
		System.out.println("기본생성자 This02_p241() 호출");
	}

	public This02_p241(String name) {
		this(name, 24);
	}

	public This02_p241(int age) {
		this("홍길동", age);
	}
	
	public This02_p241(String name, int age) {
		this(name, age, 2.2, 'b', true);
		// 생성자가 또다른 생성자를 호출시에는 this()
		// 반드시 생성자 내부에서 호출해야된다. 
		// 생성자 내부에서 반드시 첫 문장에서 호출.
		
		// The method This02_p241(String, int, double, char, boolean) is undefined for the type This02_p241
		
	}
	
	public This02_p241(String name, int age, double height, char type,boolean isBoolean) {
		System.out.println("This02_p241(매개변수5개짜리) 호출");
		this.name = name;
		this.age = age;
		this.height = height;
		this.type = type;
		this.isBoolean = isBoolean;
		System.out.println(toString()+"\n");
	}

	@Override
	public String toString() {
		return "This02_p241 [name=" + name + ", age=" + age + ", type=" + type + ", height=" + height + ", isBoolean="
				+ isBoolean + "]";
	}
	
	
	
	//메서드
	

	
	
}
