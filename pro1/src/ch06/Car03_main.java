package ch06;

// 이 클래스는 Car03 클래스의 실행클래스이다.
public class Car03_main {
	public static void main(String[] args) {
		//Car03 클래스의 객체를 생성하여 참조변수에 대입
		//단순구조. 객체는 독립적.
		Car03 c1 = new Car03();
		
		//Car03클래스의 필드값조회하는 메서드 호출
		System.out.println(c1.getCompany());
		System.out.println(c1.getPrice());
		System.out.println(c1.getFuelEff());
		System.out.println(c1.getGrade());
		System.out.println(c1.isNewCar());
		
		
		
		//Car03클래스의 필드값변경하는 메서드 호출
		c1.setCompany("월급 많이 주는 회사");
		c1.setPrice(300);
		c1.setFuelEff(8.5);
		c1.setGrade('a');
		c1.setNewCar(true);
		
		System.out.println("------------------------");
		
		//Car03클래스의 필드값조회하는 메서드 호출
		System.out.println(c1.getCompany());
		System.out.println(c1.getPrice());
		System.out.println(c1.getFuelEff());
		System.out.println(c1.getGrade());
		System.out.println(c1.isNewCar());
		
		
	}

}
