package ch13_CF;

import java.util.HashMap;
import java.util.Map;

//p576
public class Student01_main03 {

	public static void main(String[] args) {
		//Student01클래스 객체를 여러개로 생성하여 Map에 대입
		//Map 준비
		Map<Student01, Integer> map = new HashMap<Student01, Integer>();
		
		//학생별 시험점수
		//map.put(K,V) K는 중복X, V는 중복허용
		Student01 stu1 = new Student01(1,"홍길동","서울시");
		Student01 stu2 = new Student01(2,"이순신","경기도");
		Student01 stu3 = new Student01(3,"김구","울릉도");
		Student01 stu4 = new Student01(3,"김구","울릉도"); //학번, 이름, 주소가 동일하므로 중복처리된다.
		
		
		
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
		System.out.println(stu4.hashCode());
		
		
		
		
		map.put(stu1, 100);		
		map.put(stu2, 99);		
		map.put(stu3, 100);		
		map.put(stu4, 80);		
		
		
		System.out.println("size() = "+map.size()); //4 -> 3으로~
	}
	

}
	

