package ch06;

import java.util.Collections;

// static이 붙은 필드나 메서드는 프로그램 시작부터 종료시까지 종료가 됨.
public class Student01_main2 {
	public static void main(String[] args) {
		System.out.println(Student01.department); //클래스에서 department를 찾음.
		System.out.println("----------------------");
		System.out.println(Math.PI);
		System.out.println(Math.abs(123.4567));
		System.out.println(Math.abs(-12.4567));
		
		
		// static 필드는 객체가 없어도 됨. 
		// 공통적인 데이터면 static을 붙여도되고, 안붙여도된다.
		//new Student01() 는 기본 생성자를 호출해준것.
		Student01 stu1 = new Student01();
		//Student01.age=10;
		//Cannot make a static reference to the non-static field Student01.age
		
		System.out.println(stu1);
	
		Student01 stu2 = new Student01("이순신");
		System.out.println(stu2);  
		System.out.println(stu2.department);  // 참조변수에서 department를 찾음.
		
		
		Student01 stu3 = new Student01(50);
		System.out.println(stu3);
		System.out.println(stu3.department);
		
		Student01 stu4 = new Student01("이재용",50);
		System.out.println(stu4);
		
		Student01 stu5 = new Student01(45,"이건희"); // 생성자는 초기 생성시 넣는것.
		stu5.setName("강하다"); // set 메소드는 추후에 넣는것.
		System.out.println(stu5);
		
		
		
		
		
	}

}
