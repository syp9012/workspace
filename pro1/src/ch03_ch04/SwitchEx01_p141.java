package ch03_ch04;

/*조건문 switch문 진행. == 연산만 가능.
 * switch (변수){
 * 	case 값1 : // 실행코드 // break;(생략가능)
 * 	case 값2 : // 실행코드 // break;(생략가능)
 * 
 * default :
 * 
 * 
 */
public class SwitchEx01_p141 {

	public static void main(String[] args) {
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
