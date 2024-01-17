package chap03_2;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double first = sc.nextDouble();
		sc.nextLine();
		System.out.print("두 번째 수: ");
		double second = sc.nextDouble();
		sc.nextLine();
		System.out.println("---------------------");
		
		double sum = first + second;
		if(first == 0.0 | second == 0.0) {
			System.out.println("결과:무한대");
		}else {
			System.out.println("결과:"+sum);
		}
		
		
	}

}
