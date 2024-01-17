package ch01_02;

// 실수 타입 : float(4byte) < double(8byte)(기본타입)
// 정수 타입 : byte(1byte), short(2byte), int(4byte), long(8byte)
// byte < short < int < long < float < double
public class Ex03_p66 {

	public static void main(String[] args) {
		double v1 = 0.0;
		v1 = 0;
		double v2 = 3.14;
		v2 = 3;
		
		
		float v3 = (float)0.0; // 강제 형변환
		float v4 = 0.0f; // 리터럴 형변환
		// Type mismatch: cannot convert from double to float.
		
		long v6 = 2147483647;
		long v7 = 2147483648L; //The literal 2147483648 of type int is out of range 
		//뒤에 L첨부가 필요.
		int abc = (int)v7;
		
		int i1 = 10;

		System.out.println(abc);
	
	
	}

}