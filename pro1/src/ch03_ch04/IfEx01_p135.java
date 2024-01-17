package ch03_ch04;

/* 비교연산자
 * a == b a가 b와 일치.동일.같다.
 * a != b a가 b와 일치 하지 않다. 동일하지 않다.
 * 부정연산자 not !
 *
 */





/*제어문(Control Statements) - if
	조건문, 반복문(iteration statements)
	조건문 - if문, switch문
	if( 조건 ) {
		조건 만족시 실행문
	}
	switch (   )
	
	반복문 - while문, for문
	while ( 조건) {
		조건 만족시 실행문
	{
	
	for ( 변수 설정; 조건 ; 조건 미달성시 변수 변경) {
	
	}
*/

// byte(1) short(2) char(2) int(4)(default) long(8) float(4) double(8)(default) 
public class IfEx01_p135 {

	public static void main(String[] args) {
		int score = 100;
		
		boolean myScore = (score == 100);
		// 연산자의 우선순위에 의해서 == 비교연산자 실행 후 = 대입연산자 실행.
		System.out.println("score = " + score); 
		
		System.out.println(myScore); // true
		System.out.println(score == 100); // true
		System.out.println(score != 100); // false
		
		if(score == 100) {
			System.out.println("만점자군요");
		} else if(score != 100) {
			System.out.println("만점자가 아니군요");
		} 
		
	}

}
