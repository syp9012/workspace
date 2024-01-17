package ch01_02;
//primitive type byte(1)(-128~127)<short(2)<int(4)<long(8)<float(4)<double(8)
// 자동타입변환 - promotion 큰타입에서 작은타입으로 갈때 자동으로 타입변환이 된다.
// 강제타입변환 - casting  큰 타입을 작은 타입으로 강제로 나눠서 저장하는것.
public class Ex04_p73 {

	public static void main(String[] args) {
		// promotion
		byte v1 = 100;
		short v2 = v1;
		int v3 = v1;
		long v4 = v1;
		
		float v5 = v1;
		double v6 = v1;
		
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		
		System.out.println("v5="+v5); // 100.0 실수로 promotion;
		System.out.println("v6="+v6); // 100.0 실수로 promotion;
		
		}
	
}
