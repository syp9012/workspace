package ch01_02;

import java.util.Scanner;

// 문자열 String을 기본타입으로 강제 타입 변환.
public class Ex04_p83 {

	public static void main(String[] args) {
		/*
		int age = 20;
		System.out.println(age+1);

		String age2 = "20";
		System.out.println(Integer.parseInt(age2)+1); // 21
		//	// Integer 는 int의 wrapper class
		
		*/
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		String userAge = scanner.nextLine();
		System.out.println("userAge="+userAge);
		int r1 = Integer.parseInt(userAge);
		System.out.println(Integer.parseInt(userAge)+1); 
	
		
		
		
		
		
		
		
	}

}
