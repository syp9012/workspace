package backjoon;

import java.util.Scanner;

public class Backjoon_2439_star2 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        scanner.nextLine();
	        
	        for(int i = 0; i < N; i++) {
	        	for(int j = N-1; j > i; j--) {
	        		System.out.print(" ");
	        	}
	        	for(int j = -1; i > j; j++) {
	        		System.out.print("*");
	        	}
	        	System.out.println("");
	        }
	     
    }
	    
}

