package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[][] scores = {{90,50,60,40,50},
				  {80,50,60,70,50},
				  {90,60,50,70,80}
				  };
		int sum = 0;
		int avg = 0;
		int length = 0;
		
		// 배열값을 외부 입력
		for(int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = scanner.nextInt();
			}
			scanner.nextLine();
		}
		
		
		
		System.out.println("시험점수 출력방법 3가지");
		System.out.println("1. toString을 이용한 출력");
		for(int i = 0; i < scores.length; i++){
			System.out.println(Arrays.toString(scores[i]));
		}
		System.out.println("2. 다중 for문");
		for(int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("%6d",scores[i][j]);
			}
			System.out.println();
		}

		System.out.println("3.향상된 for문");
		  for(int[] score : scores) { 
			  for(int scor : score) {
			  System.out.printf("%7d",scor);
			  }
			  System.out.println();
		  }
		 

		for(int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			length += scores[i].length;
		}
		avg = sum / length;
		
		System.out.println("총점은 "+ sum);
		System.out.println("평균은 " + avg);
		
		
	}

}
