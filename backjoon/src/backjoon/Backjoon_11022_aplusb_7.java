package backjoon;

import java.util.Scanner;

public class Backjoon_11022_aplusb_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[]arrA = new int[x];
		int[]arrB = new int[x];
		int[]arr = new int[x];
		sc.nextLine();
		for(int i = 0; i < x; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arrA[i] = A;
			arrB[i] = B;
			arr[i] = A + B;
		}
		for(int i = 0; i < x; i++) {
			System.out.println("Case #"+ (i+1) +": "+arrA[i]+" + "+arrB[i]+" = " + arr[i]);
		}
	}

}
