package chap04_2;

public class Example06 {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			for(int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for(int j =-1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
