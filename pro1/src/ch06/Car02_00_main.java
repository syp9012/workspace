package ch06;

public class Car02_00_main {
	public static void main(String[] args) {
		//Car02 클래스 인스턴스화. Car02 클래스에 
		//참조변수 myCar에는 주소저장.
		Car02_00 myCar = new Car02_00();
		
		//Car02 클래스의 필드 사용.
		System.out.println("-필드초기값---");
		System.out.println(myCar.company); //null
		System.out.println(myCar.price); // 0
		System.out.println(myCar.fuelEfficiency); // 0.0
		System.out.println(myCar.grade);  // ''
		System.out.println(myCar.isNewCar); // false

		
		// 필드값을 변경.  > 외부에서 접근을 못하게 제한한다. 접근제한자.
		// 참조변수.필드명 = 값;
		System.out.println("\n-필드값 변경 후---");
		myCar.company = "현대";
		myCar.fuelEfficiency = 8.5;
		myCar.grade = 'A';
		myCar.isNewCar = true;
		myCar.price = 800;  //private 접근제한자로 표기되어 변경 불가.
		
		System.out.println(myCar.company); // 현대
		System.out.println(myCar.price); // 800 //private 접근제한자로 표기되어 조회 불가.
		System.out.println(myCar.fuelEfficiency); // A
		System.out.println(myCar.grade); // true
		System.out.println(myCar.isNewCar); // 
		
		
	}

}