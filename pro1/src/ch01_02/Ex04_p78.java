package ch01_02;

public class Ex04_p78 {

	// 실수는 유한한 비트수로 근사값을 사용.
	// 비트수가 많을 수록 정밀도가 높아짐.
	
	
	public static void main(String[] args) {
		float v1 = 1.5f;
		float v2 = 1.5f;
		double result = v1 + v2;
		//+ 덧셈연산을 하기전에 float타입 v1 과 v2 는 double로 자동 타입 변환이 일어난다.
		//double + double
		
		System.out.println("result="+result);
		
		int v11 = 1;
		float v12 = 1.5f;
		double result2 = v11 + v2; //
		System.out.println("result2="+result2);
		//+ 덧셈연산을 하기전에 float타입 v1 과 float타입 v2 는 double로 자동 타입 변환이 일어난다.

		
	}

}
