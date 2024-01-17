package ch03_ch04;

/*조건문 switch문 진행. == 연산만 가능.
 값의 데이터 타입 정수. char, String
 * 
 * 
 */
public class SwitchEx02_p143 {

	public static void main(String[] args) {
		// String 타입
		String str = "김길동1";
		System.out.println("str="+str);
		switch(str) {
		case "홍길동" :
			System.out.println("홍회원");
			break;
		case "김길동" :
			System.out.println("김회원");
			break;
		default :
			System.out.println("default");
			break;			
		}
		
		// char 타입
		char v = '김';
		System.out.println("v="+v);
		switch(v) {
		case '김' :
			System.out.println("김회원~");
			break;
		case '이' :
			System.out.println("이회원~");
			break;
		default :
			System.out.println("default");
			break;			
		}
		
		// 정수타입
		int num = (int)(Math.random()*6)+1;
		System.out.println("num="+num);
		String a = "번이 나왔습니다.";
		switch(num) {
		case 1 :
			System.out.println(num+a);
			break;
		case 2 :
			System.out.println(num+a);
			break;
		case 3 :
			System.out.println(num+a);
			break;
		case 4 :
			System.out.println(num+a);
			break;
		case 5 :
			System.out.println(num+a);
			break;
		default :
			System.out.println(num+a);
			break;			
		}
		
	}

}
