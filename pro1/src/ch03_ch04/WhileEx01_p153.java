package ch03_ch04;

/* while(p153) 무한반복에 빠지지 않도록 주의!
 * while(조건) {
 * 		조건 만족시 반복 실행 코드
 * }



*/
public class WhileEx01_p153 {

	public static void main(String[] args) {
		System.out.println("-while문 이용 출력 -------");
		int sum = 0;
		int i = 0;
		
		while(i < 6) {
			sum += i;
			i++;  // 무한반복에 빠지지 않도록! 조건 주의할것.
			System.out.println(i);
		}
		System.out.println(sum);
		System.out.println("-for문 이용 출력 -------");
		for(int j = 1; j < 6; j++) {
			System.out.println(j);
		}
		
		
	}

}
