package ch06;


// this()(p241) : 생성자가 또다른 생성자 호출
public class This01_p237 {
	//field
	int a = 10;
	
	
	//constructor
	
	//method [access-modifier][modifier] returnType methodName ([argument]){};
	void setA(int a) {
		this.a = a;
	}
	int getA() {
		return a;
	}
	
}
