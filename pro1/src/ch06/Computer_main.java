package ch06;

// 이 클래스는 Computer_p252 클래스의 실행클래스이다
public class Computer_main {
	public static void main(String[] args) {
		//객체 생성에 참조변수에 대입
		Computer com = new Computer();
		
		
		int[] arr = {1,6,9,4,45,-5};
		//메소드 호출
		//sum1()메서드는 주소가 전달
		com.sum1(arr);
		int result = com.sum1(arr);
		System.out.println("sum1() 결과 = " + result);
		// values1에는 주소가 저장.
	
		com.sum2(arr);
		result = com.sum2(arr);
		System.out.println("sum2() 결과 = " + result);
		// values1에는 주소가 저장.
		
		
		
	}
}
