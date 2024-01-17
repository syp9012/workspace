package ch01_02;

/* 변수에 대한 예제, 변수는 variable 
	데이터타입 byte(1)(-128~127)<short(2)<int(4)<long(8)
*/
public class Ex01_p53 {

	public static void main(String[] args) {
		/* 변수선언
		 * 선언부 끼리 묶어주는게 깔끔.
		 *  
		 * 데이터타입 변수명;
		 * 대입연산자 = 모든연산자중 마지막에 진행.
		 */
		
		int hour = 1;
		int minute = 23;
		int totalMinute = hour*60+minute;
		
		System.out.println(hour+"시"+" "+minute+"분");
	
		System.out.println(hour*60+minute+"분");

		System.out.println("분단위:"+(hour*60+minute)); //분단위:83
		
		System.out.println("분단위:"+totalMinute);
		
		
	
	}

}