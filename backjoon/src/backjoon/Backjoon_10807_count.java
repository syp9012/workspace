package backjoon;

import java.util.Scanner;

public class Backjoon_10807_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			arr[i] = A;
		}
		sc.nextLine();
		int C = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == C) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}

}
