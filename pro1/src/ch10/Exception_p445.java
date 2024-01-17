package ch10;

import java.util.Arrays;
import java.util.Scanner;

/*예외(p445): 잘못된 사용 또는 코딩으로 인한 오류
에러와 달리 예외 처리를 통해 계속 실행 상태를 유지할 수 있음
일반 예외(Exception): 컴파일러가 예외 처리 코드 여부를 검사하는 예외 
실행 예외(Runtime Exception): 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외

*예외처리(p453)
예외 발생 시 프로그램의 갑작스러운 종료를 막고 정상 실행을 유지할 수 있게 처리하는 코드
예외 처리 코드는 try-catch-finally 블록으로 구성 
try-catch-finally 블록은 생성자 내부와 메소드 내부에서 작성

*다중 catch로 예외 처리하기
- catch 블록의 예외 클래스는 try 블록에서 발생된 예외의 종류를 말함. 해당 타입의 예외가 발생하면 catch 블록이 선택되어 실행
- catch 블록이 여러 개라도 catch 블록은 단 하나만 실행됨

- 처리해야 할 예외 클래스들이 상속 관계에 있을 때는 하위 클래스 catch 블록을 먼저 작성하고 상위 클래스 catch 블록을 나중에 작성해야 함 

*/

public class Exception_p445 {

	public static void main(String[] args) {
		//p448
		//user에게 임의 숫자를 입력받아 0.5를 곱한 결과를 제시해주고 싶다.
		//모든 경우의 수를 예측하기 어려운경우 Exception e 객체를 통해 처리할수 있다.
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자입력하세요:");
			String a = sc.nextLine(); 
			int inputData = 0;
			
			try {
				inputData = Integer.parseInt(a);
				double result = 9000000/inputData;
				System.out.println(result);
			} catch(NumberFormatException e) {
				//Exception이 발생되는 catch block을 거친다.
				System.out.println("catch절 내부에 입장");
				System.out.println("getMessage()="+e.getMessage());
				e.printStackTrace();			
			} catch(ArithmeticException e) {
				System.out.println("catch절-ArithmeticException");
				e.printStackTrace();
			} catch(Exception e){
				System.out.println("catch절-Exception");
			} finally {
				//Exception 발생여부와 상관없이 반드시 처리해야할 부분이 있다면 이용~
				//예외처리 코드 확인
				System.out.println("finally block에 입장");
				sc.close();
			}
			
			
			System.out.println("--------------------------------");
			
			
		String data1 = "100";
		String data2 = "200원";
		//문자열 "원"은 int 타입으로 변환할수 없다. 
		
		
		int int1 = Integer.parseInt(data1);
		//int int2 = Integer.parseInt(data2);
		
		System.out.println(data1);
		System.out.println("--------------------------------");
			
		
		//p447
		String [] names = new String[3];
		names[0]= "이순신";
		names[1]= "김구";
		names[2]= "세종대왕";
		//names[3]= "을지문덕";
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		//Index 3 out of bounds for length 3
	
		// for문에서 조건을 안쓰면 무한루프
		for(int i = 0; i < names.length; i++) {
			System.out.print("names["+i+"] = "+names[i]);
		}
		
		//향상된 for문 문법 주의!
		/*p558
		 * for(Object temp : 컬렉션명) {
		 * 	 강제형클래스명 참조변수명 = (강제형변환)temp;
		 * 	 참조변수명.필드명~~~  참조변수명.메서드()~~~
		 * } 
		 * for(타입 변수명: 배열명){}
		 */
		
		
		for(String name : names) {
			System.out.print("\t"+name);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(names));
		
		
		System.out.println("-----------------------------------");
		//p446
		String str = null;
		new String("문자열");
		System.out.println(str.length()); //Exception발생
		//Exception in thread "main" java.lang.NullPointerException: 
		//Cannot invoke "String.length()" because "str" is null	
	}
}














