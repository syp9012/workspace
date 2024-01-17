package ch11;

import java.util.Random;

//Random
//Math.random()보다 다양한 
public class RandomClass {

	public static void main(String[] args) {
		Random r = new Random(); //객체생성
		System.out.println(r);
		//r.nextInt(x):0이상 x미만 까지의 난수 
		int n=r.nextInt(10);  // 
		System.out.println(n);
		
		
		//nextInt() : int 범위 안의 난수
		for(int i = 1; i < 5; i++) {
			System.out.printf("%2d, ",r.nextInt());
		}
		
		
		
		System.out.println("\n----------------------------------------");
		//nextFloat() : float 범위 안의 난수
		for(int i = 1; i < 6; i++) {
			System.out.printf("%f, ",r.nextFloat());
		}
		
		System.out.println("\n----------------------------------------");
		
		//nextDouble() : double 범위 안의 난수
		for(int i = 1; i < 6; i++) {
			System.out.printf("%f, ",r.nextDouble());
		}
		System.out.println("\n----------------------------------------");
		
		//nextBoolean() : boolean타입 난수
		for(int i = 1; i < 6; i++) {
			System.out.println(r.nextBoolean());
		}
		
		
	}

}
