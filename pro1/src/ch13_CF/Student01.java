package ch13_CF;

import java.util.Objects;

//p575토대로 + 알파
public class Student01 {
	//field - 데이터 [access-modifier][modifier] 타입 필드명 [= 초기값];
	private int sno; //학번
	private String name; //이름
	private String addr; //주소
	
	//constructor - 필드값 초기화 [public] 클래스명 ([parameter]) {}
	//객체생성시 new 클래스명()
	

	
	public Student01(int sno, String name, String addr) {
		this.sno = sno;
		this.name = name;
		this.addr = addr;
	}


	//method - 실행 [access-modifier][modifier] returnType methodName ([parameter]){}
//	@Override
//	public String toString() {
//		return "Student01 [sno=" + sno + ", name=" + name + ", addr=" + addr + "]";
//	}
//	
	//p575 12라인
	//Object의 equals는 동일한 객체라면 true 리턴, 아니며 false 리턴 
	//Object로부터 상속받은 boolean equals(Object)를 오버라이딩
	//여기에서는 학생의 학번과 이름과 주소지 3개가 모두 동일해야만 동일한 객체로 판단하여 true를 리턴
	//셋 중에 단 1개라도 다르면 서로 다른 학생이라고 판단하여 false 리턴
	
	
	//아래 해쉬코드가 오버라이딩 되어있지 않으면  사이즈 변경안됨? why?
	//Objects.hash 는 3가지의 객체를 바탕으로 1가지 해쉬코드를 만듬 . 동일 값이 들어갈경우 동일 해쉬코드만들어짐.
	@Override
	public int hashCode() {
		return Objects.hash(addr, name, sno);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass()) {
			return false;
		}
		// 아래 코드는 실행이 되는가???
		if(obj instanceof Student01) {
			Student01 other= (Student01)obj;
			return (addr.equals(other.addr)) && 
					(name.equals(other.name)) && 
					(sno==other.sno);
		}else {
			return false;
		}
		
	}
	
	
	
}
