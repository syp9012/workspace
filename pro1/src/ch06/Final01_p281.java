package ch06;

/*final(p281)
final field -  초기값이 설정된 이후에는 수정할 수 없는 최종 데이터
final method - subclass에서 오버라이딩 불가
final class -  subclass를 만들수 없다

*/

public class Final01_p281 {
	//field [access-modifier][modifier] type fieldName [= value];
	// 속성, 데이터 보관
	int a = 10;
	final int fa = 10;
	
	// constructor public className ([parameter]){}
	// 필드 초기화
	
	
	// method [access-modifier][modifier] returnType methodName ([argument]){}
	// 동작
	
	void a () {
		a=1;
		//fa = 1;(final field로 인한 수정불가)
	}
	
	final void fa() {
		a = 1;
		//fa = 1;(final field로 인한 수정불가)
	}
	
	
}

//class 자식클래스명 extends 부모클래스명
class Final02_p281 extends Final01_p281 {
	
	@Override
	void a() {
		System.out.println("재정의 가능");
	}
	
	/*
	 * @Override void fa() { System.out.println("재정의 가능"); }
	 */
	// Cannot override the final method from Final01_p281
}



