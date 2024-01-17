package ch12_Thread;


public class User2 extends Thread {
	//Thread를 상속받았기에 필드, 메서드 
	
	//필드
	// has a 관계
	private Calculator calculator;

	//생성자
	
	//메서드
	public void setCalculator(Calculator calculator) {
		setName("User2");
		this.calculator = calculator;
		
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
	
	
}
