package chap04_2;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner= new Scanner(System.in);
		
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int a = scanner.nextInt(); 
			if(a == 1) {
				System.out.print("예금액>");
				int b = scanner.nextInt();
				balance += b;
				System.out.println();
			} else if(a == 2) {
				System.out.print("출금액>");
				int b = scanner.nextInt();
				balance -= b;
				System.out.println();
			} else if(a == 3) {
				System.out.print("잔고>"+balance);
				System.out.println();
			} else if(a == 4) {
				System.out.println("\n프로그램 종료");
				break;
			}
				
		}	
	}

}
