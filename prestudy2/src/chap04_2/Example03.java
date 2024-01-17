package chap04_2;

public class Example03 {
	public static void main(String[] args) {
				
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			int sum = a + b;
			
			System.out.println("("+a+", "+b+")");
			if(sum == 5) {
				break;
			} 			
		}
		
		
	}

}
