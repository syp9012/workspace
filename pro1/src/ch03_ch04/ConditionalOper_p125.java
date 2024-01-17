package ch03_ch04;

//삼항연산자(p125) > if 문의 양을 줄일수 있다.
// 조건식 ? 참값 : 거짓
// - 과제 1 if 문을 사용하여 합격/대기합격/불합격 
//			- 삼항연산자를 사용하여 합격/대기합격/불합격 
//				삼항연산자를 사용하여 a학점/ b학점/ c학점/ d학점 / f학점 --- 
public class ConditionalOper_p125 {

	public static void main(String[] args) {
		System.out.println("-----아래는 if문------");
		
		int score = 80; // 합격 불합격
		String result = "";
		
		if(score >= 90) {
			result = "합격";
			System.out.println(result);
		} if (score >=60) {
			result = "대기합격";
			System.out.println(result);
		}	else {
			result = "불합격";
			System.out.println(result);
		}
		
		
		System.out.println("-----아래는 삼항연산자------");
		
		
		result = (score >= 90) ? "합격~" : (score >=60) ? "대기합격" : "불합격~";
		System.out.println(result); 
		
		
		result = (score >= 90) ? "A" : (score >=80) ? "B" : (score >=70) ? "C" :(score >=60) ? "D" : "F";
		System.out.println(result+"학점"); 
		
		
	
	}

}
