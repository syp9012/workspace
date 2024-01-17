package backjoon;

import java.util.Scanner;

public class Backjoon_2525_ovenClock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt()*60;
		int B = scanner.nextInt();
		scanner.nextLine();
		int C = scanner.nextInt();
		
		int sum = A + B + C;
		if(sum >=1440) {
			int D = sum - 1440;
			int E = D / 60;
			int F = D % 60;
			System.out.println(E + " " + F );
		} else {
			int D = sum;
			int E = D / 60;
			int F = D % 60;
			System.out.println(E + " " + F );
		}
	}

}
