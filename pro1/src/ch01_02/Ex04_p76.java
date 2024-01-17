package ch01_02;

// 정수 연산에서의 자동 타입 변환 p76
// ~  (+,-,*,/)    ~  

public class Ex04_p76 {

	public static void main(String[] args) {

		int v1 = 1, v2 = 2;

		int result = v1 + v2;
		long result2 = v1 + v2;
		byte result3 = (byte) (v1 + v2);

		System.out.println("result=" + result); // 3
		System.out.println("result=" + result2); // 3
		System.out.println("result=" + result3); // 3
		
		
		char v5 = '2';
		System.out.println(v5);
	}

}
