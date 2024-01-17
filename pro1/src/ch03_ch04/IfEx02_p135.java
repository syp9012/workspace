package ch03_ch04;


/* if (조건) {
 * 	조건 성립시 실행되는 코드
 * } else {
 * 	조건 불성립시 실행되는 코드
 * }
 * -----------------------------
 * if (조건1) {
 * 	조건1 성립시 실행되는 코드
 * } else if (조건2) {
 * 	조건2 성립시 실행되는 코드
 * } else {
 * 	모든 조건 성립 되지 않을시 실행되는 코드
 * }
 * -----------------------------
 * 
 * && 연산자(and)(논리곱) ||연산자(or)(논리합) : 앞조건이 false 일경우 뒷 조건을 확인안함.(처리속도가 더빠름)
 * & 연산자(and) |연산자(or) : 앞조건이 false 여도 모든 조건을 확인.(정확도 높음)
 * 
 * 비트논리 연산자 0과1이 피연산자가 됨.
 * and 두비트 모두 1일 경우에만 연산 결과가 1.
 * 
 * 
 * 
 * 
 */
public class IfEx02_p135 {

	public static void main(String[] args) {
		
		String v = "";
		int score = (int)(Math.random()*101);
		//int score = 105;
		
		System.out.println("score = " + score);
		
		
		if(score >= 0 & score <= 100) {
			if(score >= 90) {	
				v = "A";
			} else if(score >= 80) {
				v = "B";
			} else if(score >= 70) {
				v = "C";
			} else if(score >= 60) {
				v = "D";
			} else {
				v = "F";
			}
			System.out.println(v+"학점");
		} else {
			System.out.println("0이상이거나 100이하여야 합니다.");
		}
			
			System.out.println("------------------------");
		
		if(score >= 90) {
			System.out.println("합격");
		} else if (score >= 60) {  
			System.out.println("대기 합격");
		} else if (score < 60) {
			System.out.println("불합격");
		}
		
	} // main 메소드가 끝나면 프로그램 종료.

} // class.
