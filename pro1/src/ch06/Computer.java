package ch06;

public class Computer {
	// field
	
	
	
	
	//method
	//[access modifier][modifier] 리턴타입 메소드명(매개변수){},
	//sum1(1, 10) // 1, 3, 5
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i <= values.length; i++) {
			sum += values[i]; // sum = sum + values[i] 보다 왼쪽 대입연산자가 더 빠름
		}
		return sum;
	}
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i <= values.length; i++) {
			sum += values[i]; // sum = sum + values[i] 보다 왼쪽 대입연산자가 더 빠름
		}
		return sum;
	}
	
	
	
}
