package ch06;

// super : 부모참조(변수)
// super()(p314) : 부모생성자 호출
// 


class Father {
	int a = 10;
	
	void f() {
		System.out.println("아빠-f()");
	}	
}

class Son extends Father {
	
	void test() {
		a = 100; //상속받은 a를 호출. 
		super.a = 111;  // Father a 를 호출.
		this.f();  // 상속받은 f()메서드를 호출.
		super.f(); // Father f()메서드를 호출.
	}
	
	@Override
	void f() {
		System.out.println("Son가 오버라이딩한 f()");
	}
}



