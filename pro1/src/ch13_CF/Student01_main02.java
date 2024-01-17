package ch13_CF;

import java.util.HashMap;
import java.util.Map;

//p576
public class Student01_main02 {

	public static void main(String[] args) {
		//Student01클래스 객체를 여러개로 생성하여 Map에 대입
		//Map 준비
		Map<Student01, Integer> map = new HashMap<Student01, Integer>();
		
		//학생별 시험점수
		//map.put(K,V) K는 중복X, V는 중복허용
		Student01 stu1 = new Student01(1,"홍길동","서울시");
		Student01 stu2 = new Student01(2,"이순신","경기도");
		Student01 stu3 = new Student01(3,"김구","울릉도");

		stuEqual(stu1,stu2);
		stuEqual(stu1,stu3);
		stuEqual(stu2,stu3);
		
				
		System.out.println("-----------------------\n");
		int stu1HC = stu1.hashCode(); //997110508
		int stu2HC = stu2.hashCode(); //509886383
		int stu3HC = stu3.hashCode(); //1854778591
		
		if(stu1HC == stu2HC) {
			System.out.println("학생1과 2는 동일학생");
		}else {
			System.out.println("학생1과 2는 다른 학생이다.");
		}
		
		if(stu1HC == stu3HC) {
			System.out.println("학생1과 3는 동일학생");
		}else {
			System.out.println("학생1과 3는 다른 학생이다.");
		}
		
		if(stu2HC == stu3HC) {
			System.out.println("학생2과 3는 동일학생");
		}else {
			System.out.println("학생2과 3는 다른 학생이다.");
		}
		
		System.out.println("stu1해시코드 = "+stu1HC);
		System.out.println("stu2해시코드 = "+stu2HC);
		System.out.println("stu3해시코드 = "+stu3HC);
		
		map.put(stu1, 100);		
		map.put(stu2, 99);		
		map.put(stu3, 100);		
		
		
		System.out.println("size() = "+map.size()); //3
	}
	
	static void stuEqual(Student01 s1,Student01 s2) { 
		if(s1.equals(s2)){
			System.out.println("동일학생입니다.");
		}else {
			System.out.println("서로 다른 학생이다.");
		}
	}
	
}
