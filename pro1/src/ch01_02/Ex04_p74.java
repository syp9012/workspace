package ch01_02;
//primitive type byte(1)(-128~127)<short(2)<int(4)<long(8)<float(4)<double(8)
// 자동타입변환 - promotion 작은타입에서 큰타입으로 갈때 자동으로 타입변환이 된다.
// 강제타입변환 - casting  큰 타입을 작은 타입으로 강제로 나눠서 저장하는것.
public class Ex04_p74 {

	public static void main(String[] args) {
		// casting
		double v1 = 3.14;
		// float v2 = v1; type mismatch: cannot convert  
		float v2 = (float)v1;
		
		long v3 = (long)v1;
		int v4 = (int)v1;
		short v5 = (short)v1;
		byte v6 = (byte)v1;
	
		System.out.println("v1=" + v1); //3.14
		System.out.println("v2=" + v2); //3.14
		System.out.println("v3=" + v3); //3  값의 손실이 일어나는 것을 주의.
		System.out.println("v4=" + v4); //3
		System.out.println("v5=" + v5); //3
		System.out.println("v6=" + v6); //3
		
		double v7 = 10.0;
		int v8 = (int)v7;
		
		double v9 = 10.5;
		float v10 = (int)v7; // 10.0 int로 casting 후 float로 promotion
		System.out.println(v10);
		
		
		
		
		}
	
}
