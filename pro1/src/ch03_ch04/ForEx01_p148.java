package ch03_ch04;

/*반복문 - for, while, do-while
for 실행순서  
	초기화(최초1회) ->조건-> 조건 충족시 반복실행코드. -> 증감식
				  조건-> 조건 충족시 반복실행코드. -> 증감식
				  조건-> 조건 x -> for문밖
for(초기화; 조건; 증감식) {
실행문 (조건 만족시 반복 실행)
}


*/

public class ForEx01_p148 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(int i = 1; i <= 49; i++) {
			sum += i; //+= 대입연산자 // sum = sum + i 와 동일한 의미.
			num = i;
		}
		System.out.println("1~"+num+"까지의 정수합 = " + sum);
		
	
		
		 
//		for(int i = 5; i >= 1; i--) {
//			// 반복실행코드
//			System.out.println(i);
//		}
//		
//		
		for(int i = 0; i <= 10; ++i) {  
			System.out.print(i);
		}
		
		System.out.println(" ");
		
		for(int i = 0; i <= 10; i++) {  
			System.out.print(i);
		}
	}
	
}
