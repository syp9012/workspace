package ch06;

public class Student01_main {
	
	static int a = 10;
	int b = 10;
	
	void method1 () {}
	
	static void method2() {}
	
	
	public static void main(String[] args) {
		Student01_main ab = new Student01_main();
		
		a= 100; // 
		ab.b = 100;
		System.out.println(ab.b);
		
		ab.method1();
		method2();
		
		//조상클래스 = new 자손클래스; 
		Student01 stu1 = new Student01();
		System.out.println("stu1 = "+ stu1.toString());
		
		//setter() 이용하여 필드값 변경 후 getter() 호출하여 변경값 확인.
		stu1.setName("홍길동");		
		stu1.setAge(25);
		System.out.println("설정후 stu1 = "+ stu1.toString());
		
		String stu1Name = stu1.getName();
		int stu1Age = stu1.getAge();
		System.out.printf("%s의 나이는 %d\n\n",stu1Name,stu1Age);
		// constructor() 이용
		
		
		System.out.println("----------------------------------");
		
		Student01 stu2 = new Student01();
		System.out.println("stu2 = "+ stu2.toString());
		stu2.setName("이재용");		
		stu2.setAge(50);
		System.out.println("설정후 stu2 = "+ stu2.toString());
		
		String stu2Name = stu2.getName();
		int stu2Age = stu2.getAge();
		System.out.printf("%s의 나이는 %d",stu2Name,stu2Age);
		
	}
}

/* 
 * 계층 추적 > 단일 상속이기 때문에 가능.
 * 증조할 obj = new 딸(); 딸의 toString
 * 할머니 obj = new 딸(); 딸의 toString
 *  엄마 obj = new 딸(); 딸의 toString
 *    딸 obj = new 딸(); 딸의 toString
 * 
 * 
 * 
 */