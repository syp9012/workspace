package ch06;

//이 클래스는 Car04클래스의 실행클래스이다.
public class Car04_main {

	public static void main(String[] args) {
		// 클래스타입 참조변수 = new 클래스명();
		Car04 myCar = new Car04();
		
		//myCar.setGas(10);
		
		myCar.run();
		myCar.isLeftGas();
		myCar.setGas(100);
		myCar.isLeftGas();
		//myCar.run();
		myCar.getGas();	
	} //main

}
